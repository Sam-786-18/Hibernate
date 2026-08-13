package com.scjp.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.scjp.entity.Student;
import com.scjp.hibernate.util.HibernateUtil;

public class StudentInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory sessionFactory=HibernateUtil.buildSessionFactory();
Session session=sessionFactory.openSession();
Transaction tx=session.beginTransaction();
Student student=new Student();
student.setSno(101);
student.setName("rahul");
student.setMarks(350.8);
session.persist(student);
tx.commit();
session.close();


	}

}
