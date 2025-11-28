package com.Criteria;

import java.util.*;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Map1 {
	public static void main(String[] args) {
		try {
		Configuration cfg=new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Automobile.class);
		SessionFactory sf= cfg.buildSessionFactory();
		Session session =sf.openSession();
		
		
		
		int page=0;
		int pagesize=7;
		
		Criteria ct=session.createCriteria(Automobile.class);
		session.get(Automobile.class, 2);
		List<Automobile> lt=ct.list();
		
		
		for(Automobile a: lt) {
			System.out.println(a);
		}
		
		
		
		session.beginTransaction().commit();
	   session.clear();
		session.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
}
}
