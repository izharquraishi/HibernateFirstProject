package com.first;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Test {
	public static void main(String[] args) {
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cgf.xml");
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		Employee employee = new Employee();
		employee.setId(10);
		employee.setFirstName("izhar");
		employee.setLastName("quraishi");
		session.save(employee);
		transaction.commit();
		System.out.println("SuccessFully");
		session.close();
		factory.close();

	}

}
