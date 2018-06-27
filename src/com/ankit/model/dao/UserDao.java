package com.ankit.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ankit.model.User;

import controller.DatabaseConnection;

public class UserDao {
	Connection connection;
	public UserDao(Connection connection) {
		this.connection = connection;
	}

	public String updateData(User user) {
		String username = user.getUsername();
		String email = user.getEmail();
		String fname = user.getFname();
		String lname = user.getLname();
		String branch = user.getBranch();
		String year = user.getYear();

		String address = user.getAddress();
		String contact = user.getContact();
		String city = user.getCity();
		String state = user.getState();

		try {
			PreparedStatement smt = connection.prepareStatement(
					"update user set email=?,firstname=?,lastname=?,branch=?,year=?,address=?,contact=?,city=?,state=? where username='"
							+ username + "'");
			smt.setString(1, email);
			smt.setString(2, fname);
			smt.setString(3, lname);
			smt.setString(4, branch);
			smt.setString(5, year);
			smt.setString(6, address);
			smt.setString(7, contact);
			smt.setString(8, city);
			smt.setString(9, state);

			int i = smt.executeUpdate();

			if (i != 0) {
				return "success";
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return "null";

	}

	public User getUser(String username) {

		User user = new User();
		try {
			Connection connection;
			connection = new DatabaseConnection().createConnection();
			PreparedStatement smt = connection.prepareStatement("select * from user where username='" + username + "'");
			ResultSet resultSet = smt.executeQuery();

			if (resultSet.next()) {
				user.setUsername(resultSet.getString("username"));
				user.setEmail(resultSet.getString("email"));
				user.setFname(resultSet.getString("firstname"));
				user.setLname(resultSet.getString("lastname"));
				user.setBranch(resultSet.getString("branch"));
				user.setYear(resultSet.getString("year"));
				user.setAddress(resultSet.getString("address"));
				user.setContact(resultSet.getString("contact"));
				user.setCity(resultSet.getString("city"));
				user.setState(resultSet.getString("state"));
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	public User getUser(String username, String password) {
		User user = new User();
		try {
			Connection connection;
			connection = new DatabaseConnection().createConnection();
			PreparedStatement smt = connection.prepareStatement(
					"select * from user where username='" + username + "' and password='" + password + "'");
			ResultSet resultSet = smt.executeQuery();

			if (resultSet.next()) {
				user.setUsername(resultSet.getString("username"));
				user.setUsertype(resultSet.getString("usertype"));
				user.setEmail(resultSet.getString("email"));
				user.setFname(resultSet.getString("firstname"));
				user.setLname(resultSet.getString("lastname"));
				user.setBranch(resultSet.getString("branch"));
				user.setYear(resultSet.getString("year"));
				user.setAddress(resultSet.getString("address"));
				user.setContact(resultSet.getString("contact"));
				user.setCity(resultSet.getString("city"));
				user.setState(resultSet.getString("state"));
				return user;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;

	}

	public int setUser(User user) {
		String username = user.getUsername();
		String password = user.getPassword();
		String email = user.getEmail();

		try {
			Connection connection;
			connection = new DatabaseConnection().createConnection();
			PreparedStatement smt = connection
					.prepareStatement("insert into user values(?,?,?,?,?,?,?,?,?,?,?)");

			smt.setString(1, username);
			smt.setString(2, password);
			smt.setString(3, email);
			smt.setString(4, "");
			smt.setString(5, "");
			smt.setString(6, "");
			smt.setString(7, "");
			smt.setString(8, "");
			smt.setString(9, "");
			smt.setString(10, "");
			smt.setString(11, "");

			int i = smt.executeUpdate();
			if (i != 0) {
				return 1;
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return 0;
	}

	public List<User> getUsersByFirstName(String firstName) {

		List<User> users = new ArrayList<>();

		try {
			Connection connection;
			connection = new DatabaseConnection().createConnection();
			PreparedStatement smt = connection
					.prepareStatement("select * from user where firstname='" + firstName + "'");
			ResultSet resultSet = smt.executeQuery();

			while (resultSet.next()) {
				User user = new User();
				user.setUsername(resultSet.getString("username"));
				user.setEmail(resultSet.getString("email"));
				user.setFname(resultSet.getString("firstname"));
				user.setLname(resultSet.getString("lastname"));
				user.setBranch(resultSet.getString("branch"));
				user.setYear(resultSet.getString("year"));
				user.setAddress(resultSet.getString("address"));
				user.setContact(resultSet.getString("contact"));
				user.setCity(resultSet.getString("city"));
				user.setState(resultSet.getString("state"));
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}
	public List<User> getUsersByLastName(String lastName) {

		List<User> users = new ArrayList<>();

		try {
			Connection connection;
			connection = new DatabaseConnection().createConnection();
			PreparedStatement smt = connection
					.prepareStatement("select * from user where lastname='" + lastName + "'");
			ResultSet resultSet = smt.executeQuery();

			while (resultSet.next()) {
				User user = new User();
				user.setUsername(resultSet.getString("username"));
				user.setEmail(resultSet.getString("email"));
				user.setFname(resultSet.getString("firstname"));
				user.setLname(resultSet.getString("lastname"));
				user.setBranch(resultSet.getString("branch"));
				user.setYear(resultSet.getString("year"));
				user.setAddress(resultSet.getString("address"));
				user.setContact(resultSet.getString("contact"));
				user.setCity(resultSet.getString("city"));
				user.setState(resultSet.getString("state"));
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return users;
	}

}
