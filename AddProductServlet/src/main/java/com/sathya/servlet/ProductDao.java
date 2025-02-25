package com.sathya.servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductDao
{
	
	public int save(Product product) {
		//Declare the Resources
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		int saveResult=0;
		try {
			//Get the connection
			 connection= ProductUtils.createConnection();
			//Create the PS object
			preparedStatement=connection.prepareStatement("insert into product_data values(?,?,?,?,?,?,?,?)");
			//Read the data from pro object and set to parameters
			preparedStatement.setString(1, product.getProId());
			preparedStatement.setString(2, product.getProName());
			preparedStatement.setFloat(3, product.getProPrice());
			preparedStatement.setString(4, product.getProBrand());
			preparedStatement.setString(5, product.getProMadeIn());
			preparedStatement.setDate(6, product.getProMfgDate());
			preparedStatement.setDate(7, product.getProExpDate());
			preparedStatement.setBytes(8,product.getProImage());
			//preparedStatement.setBytes(8,product.getProAudio());
			
		//	preparedStatement.setBytes(8,product.getProVideo());
			
			
			saveResult=preparedStatement.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
		finally
		{
			//Before release connection check the connection present or not
			try{
				if(connection!=null)
			      connection.close();
			    if(preparedStatement!=null)
				  preparedStatement.close();
			}
			catch(SQLException e) {
			     e.printStackTrace();
			}
		}
		return saveResult;
	}
	
	
	//findall method
	public List<Product> findAll(){
		List<Product> productList=new ArrayList<Product>();
		try(Connection connection=ProductUtils.createConnection(); 
				Statement statement=connection.createStatement()){
			ResultSet resultSet=statement.executeQuery("select * from product_data");
			while(resultSet.next()) {
				Product product=new Product();
				product.setProId(resultSet.getString("1"));
				product.setProName(resultSet.getString("2"));
				product.setProPrice(resultSet.getFloat("3"));
				product.setProBrand(resultSet.getString("4"));
				product.setProMadeIn(resultSet.getString("5"));
				product.setProMfgDate(resultSet.getDate("6"));
				product.setProExpDate(resultSet.getDate("7"));
				product.setProImage(resultSet.getBytes("8"));
				
				
				productList.add(product);
			}
			
			
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return productList ;	
		
	}
	
	public int deleteById(String proId) {
		
		int result=0;
		try {
			//Get the connection
			Connection connection= ProductUtils.createConnection();
			//Create the PS object
			PreparedStatement preparedStatement=connection.prepareStatement("delete from product_data where proId=?");
			//preparedStatement=connection.prepareStatement("insert into product_data values(?,?,?,?,?,?,?,?)");
			//Read the data from pro object and set to parameters
			preparedStatement.setString(1, proId);
			result=preparedStatement.executeUpdate();		
	}
	
	
	catch(SQLException e)
		{
		e.printStackTrace();
		}
	return result;
	}
	
		public Product findbyId(String proId) {
			 Product product1=null;
			try(Connection connection=ProductUtils.createConnection();
					PreparedStatement PreparedStatement=connection.prepareStatement("select * from productdata where proId=?"))
			{
				PreparedStatement.setString(1,proId);
				ResultSet resultset=PreparedStatement.executeQuery();
				if(resultset.next()) {
					  product1=new Product();
					 product1.setProId(resultset.getString("proId"));
				      product1.setProName( resultset.getString("proName"));
				      product1.setProPrice( resultset.getDouble("proPrice"));
				      product1.setProBrand( resultset.getString("proBrand"));
				      product1.setProMadeIn(resultset.getString("proMadeIn"));
				      product1.setProMfgDate( resultset.getDate("proMfgDate"));
				      product1.setProExpDate( resultset.getDate("proExpDate"));
				      product1.setProImage(resultset.getBytes("proImage"));
				      product1.setProAudio(resultset.getBytes("proAudio"));
				      product1.setProVideo(resultset.getBytes("provideo"));
				      
				      
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
			return product1;
		}

		public int UpdateProductList(Product p) {
			int update=0;
		try(Connection connection=ProductUtils.createConnection();
				PreparedStatement PreparedStatement=connection.prepareStatement("UPDATE productdata SET proName=?, proprice=?,proBrand=?,proMadeIn=?,proMfgDate=?,proExpDate=?,proImage=? proAudio=? provideo=? WHERE proId=?"))
		{
			 
			   
		      PreparedStatement.setString( 1,p.getProName());
		      PreparedStatement.setDouble( 2,p.getProPrice());
		      PreparedStatement.setString( 3,p.getProBrand());
		      PreparedStatement.setString( 4,p.getProMadeIn());
		      PreparedStatement.setDate(5,p.getProMfgDate());
		      PreparedStatement.setDate( 6,p.getProExpDate());
		      PreparedStatement.setBytes(7,p.getProImage());
		      PreparedStatement.setBytes(7,p.getProAudio());
		      PreparedStatement.setBytes(7,p.getProVideo());
		      PreparedStatement.setString(8,p.getProId());
		      
		      update=PreparedStatement.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		return update;
		}


		public int updateById(Product product) {
			// TODO Auto-generated method stub
			return 0;
		}


	//public Product findById(String proId) {
			// TODO Auto-generated method stub
			//return null;
		//}


		//public int updateById(Product product) {
			// TODO Auto-generated method stub
			//return 0;
	//	}


		//public int UpdateById(Product product) {
			// TODO Auto-generated method stub
			//return 0;
		
		 
		
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}