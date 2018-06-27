package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ankit.model.User;
import com.ankit.model.dao.UserDao;

public class SignUp extends HttpServlet {
	Connection connection;

	@Override
	public void init() {
		connection = new DatabaseConnection().createConnection();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String email = request.getParameter("email");

		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);

		UserDao userdao = new UserDao(connection);

		int i = userdao.setUser(user);

		if (i == 1) {
			getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
		}

	}

}
