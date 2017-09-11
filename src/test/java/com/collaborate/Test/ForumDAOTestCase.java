package com.collaborate.Test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.collaborate.DAO.ForumDAO;
import com.collaborate.Model.Blog;
import com.collaborate.Model.Forum;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;


public class ForumDAOTestCase {

	static ForumDAO forumDAO;
	@BeforeClass
	public static void initialize()
	{
		AnnotationConfigApplicationContext annotationConfigAppContext=new AnnotationConfigApplicationContext();
		annotationConfigAppContext.scan("com.collaborate");
		annotationConfigAppContext.refresh();
		forumDAO=(ForumDAO)annotationConfigAppContext.getBean("forumDAO");
	}
	
@Test
	
	public void createForumTest()
	{
		
	Forum forum=new Forum();	
	
	forum.setForumId(1000);
	forum.setForumName("Jhon");
	forum.setForumContent("niit ");
	 
	forum.setStatus("NA");
	forum.setCreateDate(new java.util.Date());
	forum.setLikes(0);
	
	assertTrue("problem in blog Creation",forumDAO.createForum(forum));
	}
	
	
	
	@Ignore
    @Test
	public void approveForumTest()
	{
		
	Forum forum=new Forum();	
	
	forum.setForumId(1000);
	forum.setForumName("Jerry");
	forum.setForumContent("niit");
	
	forum.setStatus("NA");
	forum.setCreateDate(new java.util.Date());
	forum.setLikes(0);
	
	assertTrue("problem in Approving forum",forumDAO.approveForum(forum));
	}
	
	
	
	
	
}