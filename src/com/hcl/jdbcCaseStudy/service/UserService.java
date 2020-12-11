package com.hcl.jdbcCaseStudy.service;

import java.sql.SQLException;
import java.util.List;

import com.hcl.jdbcCaseStudy.model.User;

public interface UserService {

	public void insertUser(User u) throws SQLException;

	public boolean deleteUser(int id) throws SQLException;

	public boolean updateUser(User u) throws SQLException;

	public User selectUser(int id);

	public List<User> selectAllUses();

}