package com.task_7_11_2025;

import java.sql.*;
import java.util.Scanner;

public class DBConnection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
       
//        student.acceptData();
      
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/batch_414";
        String username = "root";
        String password = "abhijeet@123";

        try {
            // Load driver
            Class.forName(driver);

            // Connect to DB
            Connection conn = DriverManager.getConnection(url, username, password);
//          String cs="Java Stack";
//            // Insert query
//            String query = "update student set course='"+cs+"' where id=? ";
//             PreparedStatement ps=conn.prepareStatement(query);
//         
//          ps.setInt(1, 5);
          
            
            
//            String query="insert into student (id,name,age,city,course,phone)values(?,?,?,?,?,?)";     
//           PreparedStatement ps=conn.prepareStatement(query);
//           ps.setInt(1, student.getId());
//           ps.setString(2, student.getName());
//           ps.setInt(3, student.getAge());
//           ps.setString(4, student.getCity());
//           ps.setString(5, student.getCoursename());
//           ps.setLong(6, student.getPhone());
//           ps.executeUpdate();
//            System.out.println("data inserted successfully");
            
//            String query="select * from student";
//            Statement stmt=conn.createStatement();
//            ResultSet rs=stmt.executeQuery(query);
//            while(rs.next()) {
//            	System.out.println("ID: " + rs.getInt("id"));
//                System.out.println("Name: " + rs.getString("name"));
//                System.out.println("Age: " + rs.getInt("age"));
//                System.out.println("City: " + rs.getString("city"));
//                System.out.println("Course: " + rs.getString("course"));
//                System.out.println("Phone: " + rs.getLong("phone"));
//            }
           
            
//            String query="select * from student where id=?";
//            PreparedStatement ps=conn.prepareStatement(query);
//            ps.setInt(1, 7);
//            ResultSet rs=ps.executeQuery();
//            if(rs.next()) {
//            	System.out.println(rs.getInt("id"));
//            	System.out.println(rs.getString("name"));
//            	System.out.println("Age: " + rs.getInt("age"));
//                System.out.println("City: " + rs.getString("city"));
//                System.out.println("Course: " + rs.getString("course"));
//                System.out.println("Phone: " + rs.getLong("phone"));
//            }
            
            String str="update student set name=? where id=?";
            PreparedStatement ps=conn.prepareStatement(str);
            ps.setString(1, "Hari");
            ps.setInt(2, 7);
            int rows=ps.executeUpdate();
            if(rows>0) {
            	System.out.println("data updated");
            }
            
        } catch (ClassNotFoundException e) {
            System.out.println("❌ Driver not found: " + e);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        sc.close();
    }
}
