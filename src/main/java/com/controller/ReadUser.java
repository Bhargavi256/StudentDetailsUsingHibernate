package com.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.User;

public class ReadUser {
	public static void main(String[] args) {
       
	   SessionFactory sessionFactory = HibernateUtils.buildSessionFactory();
       Session session = sessionFactory.openSession();
       
       System.out.println("session created");
       
       //to get particular person detail from db
       User user = session.get(User.class, 1);
       System.out.println(user);
       
       //to get all the details from user database
       Query<User> query =  session.createQuery("From User",User.class);
       List<User> list = query.list();
       System.out.println(list);
	}

	
}
