package com.collaborate.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.collaborate.Model.UserTable;

@Repository("userDAO")
public class UserTableDAOImpl implements UserTableDAO{	
	
	@Autowired
	SessionFactory sessionFactory;
	public UserTableDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public boolean createUser1(UserTable user)
	{
		try
		{
			sessionFactory.getCurrentSession().saveOrUpdate(user);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised"+e);
			return false;
			
		}
	}

	public boolean createUser(UserTable user) {
		// TODO Auto-generated method stub
		return false;
	}

	public UserTable getUser(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserTable> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean approveUser(UserTable user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean editUser(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteUser(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isUsernameValid(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean registerUser(UserTable user) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isEmailValid(String email) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean createUserTable(UserTable userTable) {
		// TODO Auto-generated method stub
		return false;
	}

	public UserTable getUserTabledetails(int userTableId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<UserTable> getUserTable() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean approveUserTable(UserTable userTable) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean editUserTable(int userTableId) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean deleteUserTable(int userTableId) {
		// TODO Auto-generated method stub
		return false;
	}
	
	
}