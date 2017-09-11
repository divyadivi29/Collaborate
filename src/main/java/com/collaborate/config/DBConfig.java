package com.collaborate.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.collaborate.DAO.BlogDAO;
import com.collaborate.DAO.BlogDAOImpl;
import com.collaborate.Model.Blog;


@Configuration
@ComponentScan("com.collaborate.config")
@EnableTransactionManagement
public class DBConfig
{

public DataSource getOracleDataSource()
{
	DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();
	driverManagerDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	driverManagerDataSource.setUrl("jdbc:oracle:thin:@localhost:1521:XE");
	driverManagerDataSource.setUsername("hr");
	driverManagerDataSource.setPassword("hr");
	return driverManagerDataSource;
}
public Properties getHibernateProperties()
{
	Properties properties = new Properties();
	properties.put("hibernate.show_sql", "true");
	properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
	properties.put("hibernate.hbm2ddl.auto", "create");
	System.out.println("Hibernate Properties");
	return properties;

}
@Bean
 public SessionFactory getSessionFactory()
 {
	LocalSessionFactoryBuilder localSessionFactoryBuilder=new LocalSessionFactoryBuilder(getOracleDataSource());
	localSessionFactoryBuilder.addProperties(getHibernateProperties());
	localSessionFactoryBuilder.addAnnotatedClass(Blog.class);
	
	System.out.println("SessionFactory Bean created");
	return localSessionFactoryBuilder.buildSessionFactory();
 }
@Bean
public HibernateTransactionManager getTransaction(SessionFactory sessionFactory)
{
	 	System.out.println("Transaction");
	    return new HibernateTransactionManager(sessionFactory);
}

@Bean
public BlogDAO getBlogDAO(SessionFactory sessionFactory)
{
	 return new BlogDAOImpl(sessionFactory);
 
}
}