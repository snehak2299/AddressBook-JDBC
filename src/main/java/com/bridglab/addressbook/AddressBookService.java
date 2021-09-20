package com.bridglab.addressbook;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AddressBookService {
	 private String url = "jdbc:mysql://localhost:3306/address_book_service?useSSL=false";
	    private String username = "root";
	    private String password = "qwerty";
	    Connection con;

	    public Connection getConnection() {
	        try {
	            Class.forName("com.mysql.cj.jdbc.Driver");

	        }catch (ClassNotFoundException e){
	            e.printStackTrace();
	        }

	        try {
	            System.out.println("Connecting to database "+url);
	            con= DriverManager.getConnection(url,username,password);
	            System.out.println("Connection is successful! "+con);
	        }
	        catch (Exception e)
	        {
	            e.printStackTrace();
	        }
	        return con;
	    }
	    public void readData(){
	        String sql="SELECT * FROM address_book;";
	        try {
	            Connection connection=this.getConnection();
	            Statement statement=connection.createStatement();
	            ResultSet resultSet=statement.executeQuery(sql);
	            while (resultSet.next()){
	                System.out.println(
	                        resultSet.getString(1)+" "+
	                                resultSet.getString(2)+" "+
	                                resultSet.getString(3)+" "+
	                                resultSet.getString(4)+" "+
	                                resultSet.getString(5)+" "+
	                                resultSet.getString(6));
	            }

	        }
	        catch (SQLException e)
	        {
	            e.printStackTrace();
	        }
	    }

 }
