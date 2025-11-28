package com.Client;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Entity.Student;

public class Client {

	public static void main(String[] args) throws SQLException {
//		SessionFactory sf=    new Configuration().configure("hibernate.cfg.xml")
//              .addAnnotatedClass(Student.class)
//              .buildSessionFactory();
//		Session sn=sf.openSession();

//    	StudentController sc=new StudentController();
//		Student stud=new Student(1,"Abhijeet",(long) 34343433,"Pune");
//		String msg= sc.doRegisterStudent(stud);
//		System.out.println(msg);
//		StudentController sc = new StudentController();
//       List<Student> list = sc.fetchdata();
//        for (Student st : list) {
//            System.out.println(st.getId() + " " + st.getName() + " " + st.getCity());
//        }

//		System.out.println("________________________________________________________");

//		LEVEL 1 CACHE
 //     IT IS IMPLICITLY IN HIBERNATE .HIBERNATE AUTOMATIC CONVERT INTO ONE QUERY 
//      HIBERNATE HAVE DEFAULT SET 1 LEVEL CACHE
//		SessionFactory sf=    new Configuration().configure("hibernate.cfg.xml")
//                .addAnnotatedClass(Student.class)
//                .buildSessionFactory();
//	     
////		One session 
//		Session sn=sf.openSession();
//		
////		Two student object
////     One Query for both the student 1 and student 2 and Output Are Two
//	    Student stud1=sn.get(Student.class, 1);
//	    System.out.println(stud1);
//	    
//	    Student stud2=sn.get(Student.class, 1);
//	    System.out.println(stud2);
//	    sn.beginTransaction().commit();
//	    sn.close();

//		System.out.println("_____________________________________________________________");

//		LEVEL 2 CACHE 

//		HIBERNATE.CFG.XML PROPERTY OF CACHE LEVEL 2
//		POM.XML GROUP ID ,ARTIFACT ID,VERSION OF LEVEL 2 CACHE
//		EHCACHE.XML 
//		MANUALLY 
		SessionFactory sf = new Configuration()
				.configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class)
				.buildSessionFactory();
//	    session 1    
		Session sn = sf.openSession();
		List<Student> list = sn.createQuery("FROM Student", Student.class)
				.setCacheable(true).list();
		System.out.println(list);

//       session 2
		Session sn1 = sf.openSession();
		List<Student> list1 = sn1.createQuery("FROM Student", Student.class)
				.setCacheable(true).list();
		System.out.println(list1);

	}
}
