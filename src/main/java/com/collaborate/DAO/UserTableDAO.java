package com.collaborate.DAO;

import java.util.List;

import com.collaborate.Model.Blog;
import com.collaborate.Model.UserTable;

public interface UserTableDAO {

	public boolean createUser(UserTable user);
	public UserTable getUser(int userId);
	public List<UserTable> getUsers();
	public boolean approveUser(UserTable user);
	public boolean editUser(int userId);
	public boolean deleteUser(int userId);
	public boolean isUsernameValid(String username);
	public boolean registerUser(UserTable user);
	public boolean isEmailValid(String email);
}