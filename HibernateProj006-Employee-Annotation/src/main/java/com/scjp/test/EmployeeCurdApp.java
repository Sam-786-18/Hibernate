package com.scjp.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.scjp.entity.Employee;
import com.scjp.hibernate.util.HibernateUtil;


public class EmployeeCurdApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory sessionFactory=HibernateUtil.buildSessionFactory();
Session session=sessionFactory.openSession();
Transaction tx=session.beginTransaction();
Employee emp=new Employee();
emp.setEname("Minu");
emp.setJob("Manager");
emp.setSalary(70000.0);
session.persist(emp);
tx.commit();
session.close();


	}

}
