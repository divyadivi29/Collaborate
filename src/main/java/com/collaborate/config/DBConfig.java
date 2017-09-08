package com.collaborate.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate4.LocalSessionFactoryBuilder;

public class DBConfig
{

public DataSource getOracleDataSource()
{
	DriverManagerDataSource driverManagerDataSource=new DriverManagerDataSource();
	driverManagerDataSource.setDriverClassName("");
	driverManagerDataSource.setUrl("");
	driverManagerDataSource.setUsername("");
	driverManagerDataSource.setPassword("");
	return driverManagerDataSource;
}
public Properties getHibernateProperties()
{
	Properties properties=new Properties();
	properties.setProperty("","");
	properties.put("","");
	return properties;
}
@Bean
 public Sessionfactory getSessionFactory()
 {
	LocalSessionFactoryBuilder localSessionFactoryBuilder=new LocalSessionFactoryBuilder();
	LocalSessionFactoryBuilder.addProperties(getHibernateProperties);
	LocalSessionFactoryBuilder.addAnnotatedclass(blog.class);
	System.out.println("SessionFactory Bean created");
	return LocalSessionFactoryBuilder.buildSessionFactory();
	
	
 }
}