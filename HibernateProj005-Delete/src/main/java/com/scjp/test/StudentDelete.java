package com.scjp.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.SelectionQuery;

import com.scjp.entity.Student;
import com.scjp.hibernate.util.HibernateUtil;

public class StudentDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory sessionFactory=HibernateUtil.buildSessionFactory();
Session session=sessionFactory.openSession();
Transaction tx=session.beginTransaction();
//Medhod 1
/*
 * Student stud=new Student(); stud.setSno(107);
 *  session.remove(stud);
 *  //old hibernate versions
 *  //session.delete(stud);
 */
//method 2
/* Student stud=session.get(Student.class,105); 
session.remove(stud);
*/
//method 3
SelectionQuery<Student> query=session.createSelectionQuery("from Student where marks>=:marks", Student.class);
query.setParameter("marks", 420.0);
List<Student> list=query.list();
for(Student stud:list) 
	session.remove(stud);

//old hibernate versions
//Query query=session.createQuery("from Student where marks>=:marks",Student.class);
//query.setParameter("marks", 490.8);
//List<Student> list=query.list();
tx.commit();
session.close();


	}

}
