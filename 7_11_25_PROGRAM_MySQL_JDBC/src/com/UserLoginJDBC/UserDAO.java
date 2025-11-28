package com.UserLoginJDBC;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class UserDAO {

	Scanner sc = new Scanner(System.in);

	public void createTable() {
		try {
			Connection conn = DBConnection.getConnection();
			String query = """
					CREATE TABLE IF NOT EXISTS users(
					id INT PRIMARY KEY AUTO_INCREMENT,
					fullName VARCHAR(20) NOT NULL,
					userName VARCHAR(20) NOT NULL UNIQUE,
					password VARCHAR(20) NOT NULL,
					aadharFile LONGBLOB,
					createAT TIMESTAMP DEFAULT CURRENT_TIMESTAMP
					)""";
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(query);

			System.out.println("Created Table successfully!!");
			System.out.println("____________________________________");
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	public void signUp() {
		try {

			System.out.println("Enter Full Name ");
			String fullname = sc.nextLine();
			System.out.println("Enter username ");
			String username = sc.nextLine();
			System.out.println("Enter password ");
			String password = sc.nextLine();
			System.out.println("Enter Aadhar FILE PATH ");
			String path = sc.nextLine();
			File file = new File(path);
			FileInputStream fis = new FileInputStream(file);
			Connection conn = DBConnection.getConnection();
			String query = "INSERT INTO users (fullName, username, password, aadharFile) VALUES (?, ?, ?, ?)";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, fullname);
			ps.setString(2, username);
			ps.setString(3, password);
			ps.setBinaryStream(4, fis, (int) file.length());
			int rows = ps.executeUpdate();
			if (rows > 0) {
				System.out.println("SignUp successfully!!");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void showUsers() {
		try {
			Connection conn = DBConnection.getConnection();
			String query = "SELECT id,fullName,createAt,aadharFile FROM users";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(query);
			System.out.println("\n-----Registered Users-----");
			while (rs.next()) {
				
//				Here we use user class
				
				User user = new User();
				user.setId(rs.getInt(1));
				user.setFullName(rs.getString(2));
				user.setCreatedAt(rs.getTimestamp(3));
				System.out.println("ID -> " + user.getId() + " | Name -> " + user.getFullName() + " |Create At -> "
						+ user.getCreatedAt());
			}
			rs.close();
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void loginUsers() {
		try {
			System.out.println("Enter username ");
			String username = sc.nextLine();
			System.out.println("Enter password ");
			String password = sc.nextLine();

			Connection conn = DBConnection.getConnection();
			String query = "SELECT * FROM users where username=? AND password=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, username);
			ps.setString(2, password);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				System.out.println("Login successfully Done!!!");
			} else {
				System.err.println("Invalid usename or password ");
			}
			rs.close();
			ps.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deleteData() {
		try {
			System.out.println("Enter ID you want to delete data ");
			int id=sc.nextInt();
			sc.nextLine();
			Connection conn=DBConnection.getConnection();
			String query="DELETE FROM users where id=?";
			PreparedStatement ps=conn.prepareStatement(query);
			ps.setInt(1, id);
			int rows=ps.executeUpdate();
			if(rows>0) {
				System.out.println("Data deleted successfully!!");
			}else {
				System.err.println("ID not found !!");
			}
			conn.close();
			ps.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void readDatafromFile() {
		try {
			Connection conn = DBConnection.getConnection();
			System.out.println("Enter ID for aadhar file of User ");
			int id = sc.nextInt();
			String query = "SELECT aadharFile From users where id=?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				InputStream fis = rs.getBinaryStream("aadharFile");
				BufferedReader reader = new BufferedReader(new InputStreamReader(fis));
				System.out.println("Aadhar file content from database ");
				String line;
				while ((line = reader.readLine()) != null) {
					System.out.println(line);
				}
				reader.close();
				fis.close();
			}
			conn.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}