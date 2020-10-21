package com.atmecs.hibernate_demo.crud_op;

import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.atmecs.hibernate_demo.entity.Employee;

public class DeleteRecord 
{

	public void deleteRecord() 
	{
		SessionFactory factory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try
		{
			session.beginTransaction();
			
			int id = 1181;
			Employee emp = session.get(Employee.class, id);
			
			  session.delete(emp);
			  
			  System.out.println("Record Deleted Successfully!!\n");
			 
			  session.getTransaction().commit();
			
			  System.out.println("** Employee Details **");

				System.out.println(emp);
			 
			 
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
