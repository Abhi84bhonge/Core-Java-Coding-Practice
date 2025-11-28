package com.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.Entity.Student;

public class StudentDao {

    private static final SessionFactory sf =
            new Configuration().configure("hibernate.cfg.xml")
                               .addAnnotatedClass(Student.class)
                               .buildSessionFactory();

    public boolean doRegister(Student stud) {

        Session s = sf.openSession();
        try {
            s.beginTransaction();
            s.save(stud);
            s.getTransaction().commit();
            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;

        } finally {
            s.close();
        }
    }

    public List<Student> fetchdata() {
        Session s = sf.openSession();
        List<Student> list = null;

        try {
            s.beginTransaction();

            
            list = s.createQuery("FROM Student", Student.class).list();

            s.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            s.close();
        }

        return list;
    }
}
