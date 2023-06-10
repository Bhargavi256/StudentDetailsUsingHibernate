package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.User;

public class App {
	public static void main(String[] args) {
       
	   SessionFactory sessionFactory = HibernateUtils.buildSessionFactory();
       Session session = sessionFactory.openSession();
       
       System.out.println("session created");
       
//       User u1 = new User(2,"chikky",91.9);
//       session.beginTransaction();
//       session.save(u1);
//       session.getTransaction().commit();
       
       User u1 = new User();
       session.beginTransaction();
       u1.setName("jithu");
       u1.setMarks(99.1);
       session.save(u1);
       session.getTransaction().commit();
       System.out.println("saved");
	}

	
}
