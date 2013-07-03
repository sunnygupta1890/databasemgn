package com.nagarro;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeDAO {

	/*Configuration configuration = new Configuration()
			.configure("../../hibernate.cfg.xml");
	ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder()
			.applySettings(configuration.getProperties());
	SessionFactory factory = configuration
			.buildSessionFactory(serviceRegistryBuilder.buildServiceRegistry());*/

	public void addEmp(Employee e) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(e);
		tx.commit();
	}

	public Employee viewEmp(int id) {
		SessionFactory factory = HibernateUtil.getSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		Employee temp = (Employee) session.get(Employee.class, id);
		tx.commit();
		return temp;
	}

}
