package com.atmecs.hibernate_db_demo.test;

import org.testng.annotations.Test;

import com.atmecs.hibernate_demo.employee_crud_op.CrudMenu;

public class EmployeeDetails
{
	@Test
	public void employee_details()
	{
		CrudMenu menu = new CrudMenu();
		
		menu.operations();
	}
}
