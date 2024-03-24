package com.sathya.servlets;

import java.sql.SQLException;

public class DatabaseClient {
	
	public static void main(String[]args)throws SQLException{
	{
		EmployeeDao employeeDao=new EmployeeDao();
		
		int res1=employeeDao.save(new Employee(1001,"mahesh",117));
		System.out.println("data inserted successfully..="+res1);
		int res2=employeeDao.save(new Employee(1001,"suresh",119));
		System.out.println("data inserted successfully..="+res2);
		
		Employee emp=employeeDao.findById(1001);
		Employee emp1= employeeDao.findById(1002);
		System.out.println(emp);
		System.out.println(emp1);
		
		int result=employeeDao.update("mahesh");
		System.out.println(result);
		
		int result1=employeeDao.deleteById("mahesh");
		System.out.println( "recorded deleted successfully..args."+result1);
		
		
		
		
}
}
}