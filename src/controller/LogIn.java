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

import com.ankit.model.User;
import com.ankit.model.dao.UserDao;



 
@WebServlet("/login")
public class LogIn extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     
	PrintWriter out=response.getWriter();
		
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		
	   UserDao userdao= new UserDao();
	   User user=userdao.getUser(username, password);
	      
	   if(user!=null)
	   {
		  response.sendRedirect("./home.html");
	   }
	   else
	   { request.setAttribute("msg","invalid username/password" );
		getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
		   
	   }
	}
	 
		

}
