package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ankit.model.User;
import com.ankit.model.dao.UserDao;

public class LogIn extends HttpServlet {
	Connection connection;

	@Override
	public void init() {
		connection = new DatabaseConnection().createConnection();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
                                                                 
		String username = request.getParameter("username");
		String password = request.getParameter("password");

		UserDao userdao = new UserDao(connection);
		User user = userdao.getUser(username, password);
		if (user != null) {
			session.setAttribute("usertype", user.getUsertype());
			session.setAttribute("userfullName", user.getFname() + " " + user.getLname());
			session.setAttribute("username", username);
			request.setAttribute("pageBody", "dashboard.jsp");
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/template.jsp").forward(request, response);
		} else {
			request.setAttribute("loginError", "invalid username/password");
			getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);

		}
	}

}
