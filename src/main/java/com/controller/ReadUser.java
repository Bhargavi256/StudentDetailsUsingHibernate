package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.User;

public class ReadUser {
	public static void main(String[] args) {
       
	   SessionFactory sessionFactory = HibernateUtils.buildSessionFactory();
       Session session = sessionFactory.openSession();
       
       System.out.println("session created");
       
       User user = session.get(User.class, 1);
       System.out.println(user);
	}

	
}
