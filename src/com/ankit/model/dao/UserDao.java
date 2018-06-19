package com.ankit.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.ankit.model.User;

import controller.DatabaseConnection;

public class UserDao {

	public User getUser(String userName, String Password){
	   
		try {
			Connection connection;
			connection = new DatabaseConnection().createConnection();
			PreparedStatement smt=connection.prepareStatement("select name,pwd from userinfo where name='"+userName+"' and pwd='"+Password+"'");
			ResultSet rs=smt.executeQuery();
			if(rs.next()){
		    return new User();
			}
			else
			{
				return null;
			}
			
	            
			
		} catch (SQLException e) {
		   e.printStackTrace();
		}
		return null;
		
		}
		
	} 

		
	
	
	

