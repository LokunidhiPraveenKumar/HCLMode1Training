package com.hcl.jdbcCaseStudy.dao;

import java.sql.SQLException;
import java.util.List;

import com.hcl.jdbcCaseStudy.model.User;

public interface UserDAO {
	public boolean insert(User u) throws SQLException;

	public User select(int id);

	public List<User> selectAll();

	public boolean delete(int id) throws SQLException;

	public boolean update(User user) throws SQLException;

}