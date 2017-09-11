package com.collaborate.DAO;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.collaborate.Model.Forum;
import com.collaborate.Model.UserTable;
@Repository("userTableDAO")

public class UserTableDAOImpl implements UserTableDAO {
	@Autowired
	SessionFactory sessionFactory;
	
	public UserTableDAOImpl(SessionFactory sessionFactory)
	{
		this.sessionFactory=sessionFactory;
	}
	@Transactional

	public boolean createUserTable(UserTable userTable) {
		try
		{
			sessionFactory.getCurrentSession().saveOrUpdate(userTable);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised"+e);
			return false;
		}
		
	}
	@Transactional
	public UserTable getUserTable(int userTableId)
	{
		try
		{
			
			
			 return  (UserTable)sessionFactory.getCurrentSession().createQuery("from Usertable where userTableId="+userTableId);
			
			
		}
		catch(Exception e)
		{
			 System.out.println("Exception Arised"+e);
			 return null;
		}
	}
	@Transactional
	

	public List<UserTable> getUserTable() {
		 @SuppressWarnings("unchecked")
			List<UserTable> listUserTable = (List<UserTable>) sessionFactory.getCurrentSession().createQuery("from UserTable");
			 
		return listUserTable;
	}
	@Transactional
	public boolean approveUserTable(UserTable userTable) {
		
		try
		{
			userTable.setStatus("A");
			sessionFactory.getCurrentSession().update(userTable);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised"+e);
			return false;
		}
	}
	@Transactional

	public boolean editUserTable(int userTableId) {
		try
		{
			
			@SuppressWarnings("rawtypes")
			Query query = (Query) sessionFactory.getCurrentSession().createQuery("update UserTable where userTableId="+userTableId);
			  query.executeUpdate();
			return true;
		}
		catch(Exception e)
		{
				System.out.println("Exception Arised"+e);
			 return false;
		}
		
	}
	@Transactional

	public boolean deleteUserTable(int userTableId) {
		try
		{
			
			sessionFactory.getCurrentSession().delete(userTableId);
			return true;
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised"+e);
			return false;
		}
	}

	public UserTable getUserTabledetails(int userTableId) {
		// TODO Auto-generated method stub
		return null;
	}

}