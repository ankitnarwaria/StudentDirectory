package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.ankit.model.User;
import com.ankit.model.dao.UpdateProfileDao;
import com.ankit.model.dao.UserDao;

public class UpdateProfile extends HttpServlet {
	Connection connection;

	@Override
	public void init() {
		connection = new DatabaseConnection().createConnection();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		ServletContext servletContext = request.getServletContext();

		UserDao userDao = new UserDao(connection);
		User user = userDao.getUser(request.getSession().getAttribute("username").toString());
		request.setAttribute("pageBody", "profile.jsp");
		request.setAttribute("user", user);
		servletContext.getRequestDispatcher("/WEB-INF/jsp/template.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String fname = request.getParameter("fname");
		String lname = request.getParameter("lname");
		String branch = request.getParameter("branch");

		request.getSession().setAttribute("userfullName", fname + " " + lname);

		String year = request.getParameter("year");
		String address = request.getParameter("address");
		String contact = (request.getParameter("contact"));
		String city = request.getParameter("city");
		String state = request.getParameter("state");

		User user = new User();
		user.setUsername(username);
		user.setEmail(email);
		user.setFname(fname);
		user.setLname(lname);
		user.setBranch(branch);
		user.setYear(year);
		user.setAddress(address);
		user.setContact(contact);
		user.setCity(city);
		user.setState(state);

		UserDao updateprofile = new UserDao(connection);

		String s = updateprofile.updateData(user);

		if (s.equals("success")) {
			request.setAttribute("pageBody", "dashboard.jsp");
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/template.jsp").forward(request, response);
		}
		if (s.equals("null")) {
			request.setAttribute("errormsg", "failed to update profile");
			request.setAttribute("pageBody", "profile.jsp");
			getServletContext().getRequestDispatcher("/WEB-INF/jsp/template.jsp").forward(request, response);
		}
	}

}
