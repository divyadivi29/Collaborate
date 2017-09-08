package com.collaborate.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

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
	Properties properties=new Properties();
	
	properties.put("","");
	return properties;
}
@Bean
 public SessionFactory getSessionFactory()
 {
	LocalSessionFactoryBuilder localSessionFactoryBuilder=new LocalSessionFactoryBuilder(getOracleDataSource());
	localSessionFactoryBuilder.addProperties(getHibernateProperties());
	
	System.out.println("SessionFactory Bean created");
	return localSessionFactoryBuilder.buildSessionFactory();
 }
/*@Bean
public HibernateTransactionManager getHibernateTransactionManager(SessionFactory)
{
	
}*/
 
}