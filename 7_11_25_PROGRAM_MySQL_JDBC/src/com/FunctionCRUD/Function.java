package com.FunctionCRUD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Scanner;

public class Function {

	
	Scanner sc=new Scanner(System.in);
	private PreparedStatement ps;
	
	public void select() {
		
		try {
		Connection conn=DBConnection.getConnection();
			
			String query="SELECT * FROM functions";
			Statement stmt=conn.createStatement();
			ResultSet rs=stmt.executeQuery(query);
			while(rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				String city=rs.getString(3);
				Timestamp accessAt=rs.getTimestamp(4);
				System.out.println(id+" "+name+" "+city+" "+" Created at:- "+accessAt);
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void InsertData() {
		
		try{
		System.out.println("enter id ");
		int id=sc.nextInt();
		sc.nextLine();
		System.out.println("enter the name ");
		String name=sc.nextLine();
		System.out.println("enter the city ");
		String city=sc.nextLine();
		
		Connection conn=DBConnection.getConnection();
		String query="INSERT INTO functions (id,name,city) values(?,?,?)";
		PreparedStatement ps=conn.prepareStatement(query);
		 ps.setInt(1, id);
		 ps.setString(2, name);
		 ps.setString(3, city);
		int rows=ps.executeUpdate();
		if(rows>0) {
			System.out.println("data inserted successfully!!");
		}else {
			System.out.println("data not inserted");
		}
		
		
	}catch(Exception e) {
		e.printStackTrace();
	}
	}
	
	public void updateData() {
		try {
			Connection conn=DBConnection.getConnection();
			System.out.println("enter the id you want to update data ");
			int updateid=sc.nextInt();
			sc.nextLine();
			System.out.println("what do you want to update ");
			System.out.println("1 -> name ");
			System.out.println("2 ->  city ");
			System.out.println("3 -> name and city ");
			System.out.println("_____________________________");
			int choice=sc.nextInt();
			sc.nextLine();
			String query="";
			ps = null;
			
			switch(choice) {
			case 1:
				System.out.println("enter name you want to update ");
			     String name=sc.nextLine();
			      query="UPDATE FROM functions SET name =? where id=?";
			      ps=conn.prepareStatement(query);
			      ps.setString(1, name);
			      ps.setInt(2, updateid);
			      break;   
			
			case 2:
				 System.out.print("Enter new City: ");
                 String newCity = sc.nextLine();
                 query = "UPDATE functions SET city = ? WHERE id = ?";
                 ps = conn.prepareStatement(query);
                 ps.setString(1, newCity);
                 ps.setInt(2, updateid);
                 break;
			case 3:
				System.out.print("Enter new Name: ");
                String name1 = sc.nextLine();
                System.out.print("Enter new City: ");
                newCity = sc.nextLine();
                query = "UPDATE functions SET name = ?, city = ? WHERE id = ?";
                ps = conn.prepareStatement(query);
                ps.setString(1, name1);
                ps.setString(2, newCity);
                ps.setInt(3, updateid);
                break;
                default :
                	System.out.println("invalid choice");
                	return;
			}
			int rows=ps.executeUpdate();
			if(rows>0) {
				System.out.println("data updated successfully!!");
			}else {
				System.err.println("no record found with id "+updateid);
			}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	public void deleteData() {
	    try {
	        System.out.println("Enter ID you want to delete: ");
	        int id = sc.nextInt();
	        sc.nextLine(); // consume newline

	        Connection conn = DBConnection.getConnection();
	        // ✅ make sure the table name is "functions" (same as your create table)
	        String query = "DELETE FROM functions WHERE id = ?";
	        PreparedStatement ps = conn.prepareStatement(query);
	        ps.setInt(1, id);

	        int rows = ps.executeUpdate();
	        if (rows > 0) {
	            System.out.println("✅ Data deleted successfully!");
	        } else {
	            System.out.println("⚠️ No record found with ID: " + id);
	        }

	        ps.close();
	        conn.close();

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

		
	
	
}
