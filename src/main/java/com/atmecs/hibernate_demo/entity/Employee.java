package com.atmecs.hibernate_demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp_details")
public class Employee 
{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private int emp_id;
 
    @Column(name = "emp_name")
    private String emp_name;
 
    @Column(name = "e_mail")
    private String e_mail;
 
    @Column(name = "phone")
    private String phone;
 
    @Column(name = "salary")
    private String salary;
    
    @Column(name = "p_id")
    private int p_id;

    public Employee()
    {
    	
    }
    
	public Employee(String emp_name, String e_mail, String phone, String salary,int p_id) 
	{
		this.emp_name = emp_name;
		this.e_mail = e_mail;
		this.phone = phone;
		this.salary = salary;
		this.p_id = p_id;
		
	}

	public int getEmp_id() 
	{
		return emp_id;
	}
	
	public void setEmp_id(int emp_id) 
	{
		this.emp_id = emp_id;
	}

	public String getEmp_name() 
	{
		return emp_name;
	}

	public void setEmp_name(String emp_name) 
	{
		this.emp_name = emp_name;
	}

	public String getE_mail()
	{
		return e_mail;
	}

	public void setE_mail(String e_mail) 
	{
		this.e_mail = e_mail;
	}

	public String getPhone() 
	{
		return phone;
	}

	public void setPhone(String phone) 
	{
		this.phone = phone;
	}

	public String getSalary() 
	{
		return salary;
	}

	public void setSalary(String salary) 
	{
		this.salary = salary;
	}
	
	public int getP_id() 
	{
		return p_id;
	}

	public void setP_id(int p_id) 
	{
		this.p_id = p_id;
	}
}
