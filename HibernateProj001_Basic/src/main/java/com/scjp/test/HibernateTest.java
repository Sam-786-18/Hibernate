package com.scjp.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.scjp.hibernate.util.HibernateUtil;

public class HibernateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory sessionFactory=HibernateUtil.buildSessionFactory();
Session session=sessionFactory.openSession();
String version=(String) session.createNativeQuery("select version()").getSingleResult();
System.out.println("MySql version"+version);
	}

}
