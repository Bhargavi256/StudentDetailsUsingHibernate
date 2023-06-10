package com.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.User;

public class UpdateUser {
	public static void main(String[] args) {
       
	   SessionFactory sessionFactory = HibernateUtils.buildSessionFactory();
       Session session = sessionFactory.openSession();
       
       System.out.println("session created");
       session.beginTransaction();
       User user = session.load(User.class, 1);
       user.setName("chintu");
       session.update(user);
       session.getTransaction().commit();
       System.out.println(user);
	}

	
}
