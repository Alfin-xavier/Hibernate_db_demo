package com.atmecs.hibernate_demo.crud_op;

import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.atmecs.hibernate_demo.entity.Employee;

public class AddRecord 
{
	public void addEmployee()
	{
		SessionFactory factory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try
		{
			session.beginTransaction();
			
			Employee emp = new Employee(1184,"abc", "abc@gmail.com", "8675544384", "35000","SDET");
			
			session.save(emp);
			
			session.getTransaction().commit();
		}
		catch(SessionException e){
		}
		finally
		{
			session.close();
			factory.close();
		}
	}
}
