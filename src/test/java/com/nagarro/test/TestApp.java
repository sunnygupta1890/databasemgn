package com.nagarro.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.nagarro.Employee;
import com.nagarro.HibernateUtil;

public class TestApp {

	public void testHib() {
		
		try{
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session  = factory.openSession();
		org.hibernate.Transaction transaction = session.beginTransaction();
		Employee employee = new  Employee();
		employee.setAge(28);
		employee.setCity("Narwana");
		employee.setName("Sunny");
		session.save(employee);
		//session.close();
		transaction.commit();
		
		factory = HibernateUtil.getSessionFactory();
		session  = factory.openSession();
		transaction = session.beginTransaction();
		employee = (Employee)session.get(Employee.class, new Integer(1));
		System.out.println(employee.getName());
		//session.close();
		transaction.commit();
		
		Thread.sleep(6000);
		
		session  = factory.openSession();
		transaction = session.beginTransaction();
		employee = (Employee)session.get(Employee.class, new Integer(1));
		System.out.println(employee.getName());
		//session.close();
		transaction.commit();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
