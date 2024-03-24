package com.sathya.servlets;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeDao {

	
	private PreparedStatement preparedStatement;
	private int empId;
	private Employee employee;

	public int save(Employee emp) {
		Connection connection=null;
		
		PreparedStatement preparedStatement=null;
		int count=0;
		try {
			//get the connection
			connection=Dbconnection.creatConnection();
			//create the preparedstatement object
			preparedStatement=connection.prepareStatement("insert into emp values(?,?,?)");
			
			//read the data from emp object and set to parameter
			preparedStatement.setInt(1, emp.getEmpId());
			preparedStatement.setString(2, emp.getEmpname());
			preparedStatement.setDouble(3, emp.getEmpSalary());
			
			count=preparedStatement.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			try
			{
				if(connection!=null)
					connection.close();
				if(preparedStatement!=null)
					preparedStatement.close();
			}
				catch(SQLException e)
				{
					e.printStackTrace();
				}
		}
				return count;
			
				
	}

public Employee findById(int empId) {
	Employee employee=null;
	try(Connection connection=Dbconnection.creatConnection();
			PreparedStatement preparedStatement=connection.prepareStatement("select*from emp where empId=?");
}

{
	preparedStatement.setInt(1, empId);
	ResultSet resultset=preparedStatement.executeQuery();
	if(resultset.next())
	{
		employee=new Employee();
		employee.setEmpId(resultset.getInt(1));
		employee.setEmpname(resultset.getString(2));
		employee.setEmpSalary(resultset.getDouble(3));
		
	}
	
}
catch (SQLException e)
{
	e.printStackTrace();
}	
return Employee;
}

public int update(String empName) {
	
}

public int deleteById(String string) {
	// TODO Auto-generated method stub
	return 0;

	public Employee findById() {
		// TODO Auto-generated method stub
		return null;
	//public update(String string) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteById1(String string) {
		// TODO Auto-generated method stub
		return 0;
	}
		
}

  
	
	




	
	
	


