package com.twk.restservice;

import java.sql.*;

public class DocData {
    private String id;
  


    public DocData()
    {
    }

    public String getId()
    {
    	return id;
    }



    public void read_document(String key, String value)
    {
    	/* implement read method */
    	//Class.forName("com.mysql.jdbc.Driver");  
    	try {
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:8081/test","root","root"); //Changed from 3306 to 8081
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}  
    	//here test is database name, root is username and password  

	
    }   

}
