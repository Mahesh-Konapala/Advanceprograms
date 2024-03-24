package com.sathya.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Transaction
{
    public static void main(String[] args) throws SQLException 
    {
    	
		Connection connection=null;
		Statement statement=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","system","manager");
			statement=connection.createStatement();
			connection.setAutoCommit(false);
statement.executeUpdate("insert into emp values(1001,'mahesh',10000.45)");			
statement.executeUpdate("insert into emp values(1002,'ramesh',20000.45)");
statement.executeUpdate("insert into emp values(1003,'rajesh',10000.45)");
statement.executeUpdate("delete from emp where empid=1001");
System.out.println("transaction successfull...");
connection.commit();

    
    }

    
		
    
    
	
	catch(ClassNotFoundException | SQLException e)

	
	{
		e.printStackTrace();
		connection.rollback();
		System.out.println("transaction fail..");
		
	}
    
	
	
	finally
	{
	
		if(connection!=null)  connection.close();
		if(statement!=null) statement.close();
	

	}



    }
}




