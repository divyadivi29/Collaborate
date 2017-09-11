package com.collaborate.DAO;

import java.util.List;

import com.collaborate.Model.UserTable;
import com.collaborate.Model.UserTable;

public interface UserTableDAO {
	public boolean createUserTable(UserTable userTable);
	public UserTable getUserTabledetails(int userTableId);
	public List<UserTable> getUserTable();
	public boolean approveUserTable(UserTable userTable);
	public boolean editUserTable(int userTableId);
	public boolean deleteUserTable(int userTableId);
}
