package com.atmecs.hibernate_demo.crud_op;

import org.hibernate.Session;
import org.hibernate.SessionException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.atmecs.hibernate_demo.entity.Employee;

public class UpdatedRecord 
{

	public void updateRecord() 
	{
			
			SessionFactory factory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml")
										.addAnnotatedClass(Employee.class).buildSessionFactory();
			Session session = factory.getCurrentSession();
			
			try
			{
				session.beginTransaction();
				
				int id = 1;
				Employee emp = session.get(Employee.class, id);
				
				System.out.println("** Before Update **");

				System.out.println("Employee Id: " + emp.getEmp_id() + "\n" + "Employee Name: " + emp.getEmp_name() + "\n");
				
				emp.setEmp_name("Alfin");
				
				 session.update(emp);
				 System.out.println("Recorde Updated Successfully!!\n");
				 
				 session.getTransaction().commit();
				
				 System.out.println("** After Update **");

					System.out.println("Employee Id: " + emp.getEmp_id() + "\n" + "Employee Name: " + emp.getEmp_name() + "\n");
				
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
