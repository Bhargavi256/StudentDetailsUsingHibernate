package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.User;

public class DeleteUser {
	public static void main(String[] args) {
       
	   SessionFactory sessionFactory = HibernateUtils.buildSessionFactory();
       Session session = sessionFactory.openSession();
       
       System.out.println("session created");
       session.beginTransaction();
        session.delete(new User(2,"",0.00));
       session.getTransaction().commit();
//       System.out.println(user);
	}

	
}
