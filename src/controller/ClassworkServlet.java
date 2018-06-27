package controller;

import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ankit.model.Semester;
import com.ankit.model.dao.SubjectDao;

public class ClassworkServlet extends HttpServlet {
	Connection connection;

	@Override
	public void init() {
		connection = new DatabaseConnection().createConnection();
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SubjectDao subjectDao = new SubjectDao(connection);
		String branch = request.getParameter("branch");
		String semesterId = request.getParameter("semester");
		if (branch != null) {
			request.setAttribute("selectedBranch", branch);
		}
		if (semesterId != null) {

			request.setAttribute("subjects", subjectDao.findSubjectBySemester(semesterId));
			request.setAttribute("selectedSemesterId", semesterId);
		}

		request.setAttribute("sub", null);

		List<Semester> semesters = new ArrayList<>();
		semesters.add(new Semester(1, "Sem 1"));
		semesters.add(new Semester(2, "Sem 2"));
		semesters.add(new Semester(3, "Sem 3"));
		semesters.add(new Semester(4, "Sem 4"));
		semesters.add(new Semester(5, "Sem 5"));
		semesters.add(new Semester(6, "Sem 6"));
		semesters.add(new Semester(7, "Sem 7"));
		request.setAttribute("semesters", semesters);
		request.setAttribute("branches", subjectDao.loadBranches());

		request.setAttribute("pageBody", "classwork.jsp");
		request.getServletContext().getRequestDispatcher("/WEB-INF/jsp/template.jsp").forward(request, response);

	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String branch = request.getParameter("branch");
		String semesterId = request.getParameter("semester");
		String subject = request.getParameter("subject");
		String classWorkDetails = request.getParameter("classWorkDetails");

		System.out.println(classWorkDetails);
		request.setAttribute("classworkSaved", "Data saved successfully");

		request.setAttribute("pageBody", "classwork.jsp");

		request.getServletContext().getRequestDispatcher("/WEB-INF/jsp/template.jsp").forward(request, response);

	}

}
