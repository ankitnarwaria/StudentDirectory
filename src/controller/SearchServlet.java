package controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ankit.model.User;
import com.ankit.model.dao.UserDao;

public class SearchServlet extends HttpServlet {
	Connection connection;

	@Override
	public void init() {
		connection = new DatabaseConnection().createConnection();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String firstName = request.getParameter("firstName");
		if (firstName != null && !firstName.equals("")) {
			UserDao userDao = new UserDao(connection);
			List<User> users = userDao.getUsersByFirstName(firstName);
			request.setAttribute("users", users);
			request.setAttribute("firstName", firstName);
		}
		String lastName = request.getParameter("lastName");
		if (lastName != null && !lastName.equals("")) {
			UserDao userdao = new UserDao(connection);
			List<User> users = userdao.getUsersByLastName(lastName);
			request.setAttribute("users", users);
			request.setAttribute("lastName", lastName);

		}

		request.setAttribute("pageBody", "search.jsp");
		RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/jsp/template.jsp");
		dispatcher.forward(request, response);

	}

}
