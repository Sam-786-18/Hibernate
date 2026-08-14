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
student.setSno(107);
student.setName("dinu");
student.setMarks(400.8);
session.persist(student);
session.flush();
tx.commit();
session.close();


	}

}
