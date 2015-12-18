/**
 * 2015. 11. 28.
 * Copyright by yyh / Hubigo AIAL
 * CommonDAO.java
 */
package com.warmcompany.udong.common;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class CommonDAO {
	
	@Autowired
	SessionFactory factory;
	
	@Transactional
	public void save(Object object)	{
		Session session = getCurrentSession();
		session.save(object);
	}
	
	public void delete(Object object)	{
		Session session = getCurrentSession();
		session.delete(object);	
	}
	
	public void update(Object Object)	{
		Session session = getCurrentSession();
	}
	
	public <T> T get(Object object)	{
		Object result = null;
		return (T)result;
	}
	
	protected Session getCurrentSession()	{
		return factory.getCurrentSession();
	}
}
