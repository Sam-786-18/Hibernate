package com.scjp.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.scjp.entity.Address;
import com.scjp.entity.Customer;
import com.scjp.hibernate.util.HibernateUtil;

public class OneToOneMappingTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory sessionFactory=HibernateUtil.buildSessionFactory();
Session session=sessionFactory.openSession();
Transaction tx=session.beginTransaction();
Address address=new Address("234 Elm St","Metropolicity","NY","10001");
Customer customer=new Customer("David Smith","Dsmith@Yahoo.com",address);
session.persist(address);
session.persist(customer);
session.flush();
tx.commit();
session.close();


	}

}
