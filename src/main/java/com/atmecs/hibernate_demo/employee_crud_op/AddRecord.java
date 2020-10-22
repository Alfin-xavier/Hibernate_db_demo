package com.atmecs.hibernate_demo.employee_crud_op;

import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.atmecs.hibernate_demo.employee_entity.Employee;

public class AddRecord 
{
	public void addEmployee()
	{
		SessionFactory factory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try
		{
			session.beginTransaction();
			
			//Employee emp = new Employee("Alfin", "alfin@gmail.com", "8675542084", "35000",1111);
			
			Employee emp = new Employee("Shane", "Shane@gmail.com", "8675542084", "35000",1111);
			session.save(emp);
			System.out.println("Record Added Successfully!!");
			
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
