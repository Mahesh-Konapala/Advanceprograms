package com.sathya.servlets;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbcex {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//step1 load the driver
        Class.forName("oracle.jdbc.driver.OracleDriver");
        System.out.println("Driver loaded successfully...");
        
        // step2 create the connection
        
        Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe","system","manager");
        		System.out.println("connection created successfully...");
        		
        		//process the query
        	
        	    Statement statement=connection.createStatement();
        		String q1="create table empp(id number,name varchar2(30),salary number)";
        		int res1=statement.executeUpdate(q1);
        		System.out.println("table created successfully..=" +res1);
        		
       //step4 close the resources
        		connection.close();
        		System.out.println("connection closed successfully...");
        	
	}

}
