package com.ankit.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.ankit.model.Branch;
import com.ankit.model.Subject;

public class SubjectDao {
	Connection connection;

	public SubjectDao(Connection connection) {
		this.connection = connection;
	}

	public List<Subject> findSubjectBySemester(String semesterId) {
		try {
			PreparedStatement ps = connection.prepareStatement("select * from subject where semesterid=" + semesterId);

			ResultSet rs = ps.executeQuery();

			List<Subject> subjects = new ArrayList<>();
			while (rs.next()) {
				Subject subject = new Subject();
				subject.setId(rs.getInt("subjectid"));
				subject.setName(rs.getString("subjectname"));

				subjects.add(subject);

			}
			return subjects;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

	public List<Branch> loadBranches() {
		try {
			PreparedStatement ps = connection.prepareStatement("select * from branch");

			ResultSet rs = ps.executeQuery();

			List<Branch> branches = new ArrayList<>();
			while (rs.next()) {
				branches.add(new Branch(rs.getInt("branch_id"), rs.getString("name")));

			}
			return branches;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return null;
	}

}
