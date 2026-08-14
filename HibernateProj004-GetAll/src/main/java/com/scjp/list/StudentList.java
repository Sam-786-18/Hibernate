package com.scjp.list;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.SelectionQuery;

import com.scjp.entity.Student;
import com.scjp.hibernate.util.HibernateUtil;

public class StudentList {
public static void main(String[] args) {
	SessionFactory sessionFactory=HibernateUtil.buildSessionFactory();
	Session session=sessionFactory.openSession();
	SelectionQuery<Student> query=session.createSelectionQuery("from Student",Student.class);
	List<Student>list=query.getResultList();
	for(Student stud:list) {
		System.out.println(stud.getSno()+" "+stud.getName()+" "+stud.getMarks());
	}
}
}
