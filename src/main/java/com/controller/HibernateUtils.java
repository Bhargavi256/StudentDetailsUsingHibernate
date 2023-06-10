package com.controller;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.User;

public class HibernateUtils {

	private static  SessionFactory sessionFactory= null;
	public static SessionFactory buildSessionFactory() {
		if(sessionFactory == null)
		{
			try {

				Configuration cfg = new Configuration();
				cfg.configure("hibernate.cfg.xml");
				cfg.addAnnotatedClass(User.class);
				sessionFactory = cfg.buildSessionFactory();
			}catch(Exception e) {
				System.out.println(e);
			}
		}

		return sessionFactory;
	}
}
