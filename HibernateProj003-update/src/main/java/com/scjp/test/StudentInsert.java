package com.scjp.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;

import com.scjp.entity.Student;
import com.scjp.hibernate.util.HibernateUtil;

public class StudentInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory sessionFactory=HibernateUtil.buildSessionFactory();
Session session=sessionFactory.openSession();
Transaction tx=session.beginTransaction();
//Student stud=session.get(Student.class, 102);

//stud.setName("Rajesh");
//stud.setMarks(250.8);
//session.merge(stud);
//second method
//old Hibernate versions
//Student stud=(Session)session.get(Student.class, 102);
//stud.setMarks(500.8);
//session.update(stud);//update metod deprecated in hibernate 6.0
MutationQuery query=session.createMutationQuery("update Student set marks=:marks where name=:name");
query.setParameter("marks", 490.8);
query.setParameter("name", "Rajesh");
//Query query=session.createQuery("update Student set marks=:marks where name=:name");
//query.setParameter("marks", 490.8);
//query.setParameter("name", "Rajesh");
//query.executeUpdate();
query.executeUpdate();
tx.commit();
session.close();


	}

}
