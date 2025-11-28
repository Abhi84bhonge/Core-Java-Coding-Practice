package com.UserLoginJDBC;

import java.util.Scanner;

public class UserApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UserDAO dao = new UserDAO();
		dao.createTable();

		while(true) {
			System.out.println("\n=====USER LOGIN SYSTEM=====");
			System.out.println("1. Sign Up");
			System.out.println("2. Show Users");
			System.out.println("3. Login");
			System.out.println("4. Read Aadhar Data from File ");
			System.out.println("5. Delete Data ");
			System.out.println("6. Exit");
			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				dao.signUp();
				dao.loginUsers();
				break;
				
			case 2:
				dao.showUsers();
				System.out.println("\n Now please log in to continue: ");
				
				break;
			case 3:
				dao.loginUsers();
				break;
			case 4:
				dao.readDatafromFile();
			    break;
			case 5:
				dao.deleteData();
			    break;
			case 6:
				System.out.println("------Exiting-----");
				System.exit(0);
				break;
			default:
				System.out.println("-----Invalid Choice-----");
				sc.close();
			}
		}

	}
}

