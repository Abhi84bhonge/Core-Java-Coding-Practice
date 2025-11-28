package com.DAO;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Entity.Doctor;
import com.HibernateConfig.Hibernate_Config;

public class DoctorDao {

	
    // Register new doctor
    public boolean registerDoctor(Doctor doctor) {
        Transaction tx = null;
        try (Session session = Hibernate_Config.getsessionFactory().openSession()) {

            tx = session.beginTransaction();
            session.persist(doctor);
            tx.commit();
            return true;

        } catch (Exception e) {
            if (tx != null) tx.rollback();
            return false;
        }
    }

    // Get doctor list (all)
    public List<Doctor> getAllDoctors() {
        try (Session session = Hibernate_Config.getsessionFactory().openSession()) {
            Criteria ct = session.createCriteria(Doctor.class);
            return ct.list();
        }
    }

    // Get doctor by email
    public Doctor getDoctorByEmail(String email) {
        try (Session session = Hibernate_Config.getsessionFactory().openSession()) {
            Criteria ct = session.createCriteria(Doctor.class);
            ct.add(org.hibernate.criterion.Restrictions.eq("email", email));
            return (Doctor) ct.uniqueResult();
        }
    }

    // Update doctor (for status change)
    public boolean updateDoctor(Doctor doctor) {
        Transaction tx = null;
        try (Session session = Hibernate_Config.getsessionFactory().openSession()) {

            tx = session.beginTransaction();
            session.update(doctor);
            tx.commit();
            return true;

        } catch (Exception e) {
            if (tx != null) tx.rollback();
            return false;
        }
    }
    
    public boolean updateStatusById(int id) {
        Session session = Hibernate_Config.getsessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Doctor doctor = session.get(Doctor.class, id);

        if (doctor != null) {
        	Scanner sc=new Scanner(System.in);
        	System.out.println("Enter status as Active or InActive");
        	String status=sc.nextLine();
        	
           if(status.equals("Active")||status.equals("InActive")) {
        	doctor.setStatus(status);
            session.update(doctor);
            tx.commit();
            session.close();
           
            return true;
           
        }

        session.close();
        
        }
    else {
    	System.err.println("Invalid Status!!!");
    }
		return false;

    }
    
    public static String getStatus() {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter Doctor ID to check Status ");
    	int id=sc.nextInt();
    	Session session = Hibernate_Config.getsessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Doctor doctor = session.get(Doctor.class, id);
        String status=  doctor.getStatus();
        return status;
    }
}



