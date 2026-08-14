package com.scjp.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.scjp.entity.Employee;
import com.scjp.hibernate.util.HibernateUtil;

import jakarta.persistence.Query;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

public class CriteriaAPITest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
SessionFactory sessionFactory=HibernateUtil.buildSessionFactory();
Session session=sessionFactory.openSession();
CriteriaBuilder criteriaBuilder=session.getCriteriaBuilder();
CriteriaQuery<Employee>criteriaQuery=criteriaBuilder.createQuery(Employee.class);
Root<Employee> root=criteriaQuery.from(Employee.class);
criteriaQuery.select(root);
Query query=session.createQuery(criteriaQuery);
List<Employee> empList=query.getResultList();
for(Employee emp:empList)
	System.out.println(emp);
/*
 * Transaction tx=session.beginTransaction(); tx.commit(); session.close();
 */
//old Hibernate version

/*
 * Criteria criteria=session.createCriteria(Employee.class); List<Employee>
 * empList=query.getResultList(); for(Employee emp:empList)
 * System.out.println(emp);
 */

	}

}
