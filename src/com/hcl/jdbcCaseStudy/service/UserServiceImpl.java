package com.hcl.jdbcCaseStudy.service;

import java.sql.SQLException;
import java.util.List;

import com.hcl.jdbcCaseStudy.dao.UserDAO;
import com.hcl.jdbcCaseStudy.dao.UserDAOImpl;
import com.hcl.jdbcCaseStudy.model.User;

public class UserServiceImpl implements UserService {

	public UserDAO userDAO = new UserDAOImpl();

	@Override
	public void insertUser(User u) throws SQLException {
		// TODO Auto-generated method stub
		if (userDAO.insert(u))
			System.out.println("Inserted Successfully!!!");
		else
			System.out.println("Inserted Failed");
	}

	@Override
	public boolean deleteUser(int id) throws SQLException {
		// TODO Auto-generated method stub

		return userDAO.delete(id);
	}

	@Override
	public boolean updateUser(User u) throws SQLException {
		// TODO Auto-generated method stub
		return userDAO.update(u);
	}

	@Override
	public User selectUser(int id) {
		// TODO Auto-generated method stub
		return userDAO.select(id);
	}

	@Override
	public List<User> selectAllUses() {
		// TODO Auto-generated method stub
		return userDAO.selectAll();
	}

}
