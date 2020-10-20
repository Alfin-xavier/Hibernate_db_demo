package com.atmecs.hibernate_demo.crud_op;

import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.atmecs.hibernate_demo.entity.Employee;

public class DisplayRecord 
{
	public void displayRecord()
	{
		SessionFactory factory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
		Session session = factory.getCurrentSession();
		
		try
		{
			session.beginTransaction();
			
			int id = 1181;
			Employee emp = session.get(Employee.class, id);
			
			System.out.println("Employee Id::"+emp.getEmp_id());
			System.out.println("Employee Name::"+emp.getEmp_name());
			System.out.println("Employee Project::"+emp.getP_name());
			System.out.println("Employee E_mail::"+emp.getE_mail());
			System.out.println("Employee Phone::"+emp.getPhone());
			System.out.println("Employee Salary::"+emp.getSalary());
			
			//System.out.println("Employee Details::"+ emp);
			
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
