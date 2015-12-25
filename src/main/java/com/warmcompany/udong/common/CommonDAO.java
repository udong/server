/**
 * 2015. 11. 28.
 * Copyright by yyh / Hubigo AIAL
 * CommonDAO.java
 */
package com.warmcompany.udong.common;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.warmcompany.udong.document.model.Document;

@Repository
public class CommonDAO {
	
	@Autowired
	SessionFactory factory;
	
	@Transactional
	public void save(Object object)	{
		Session session = getCurrentSession();
		session.save(object);
	}
	
	@Transactional
	public void delete(Object object)	{
		Session session = getCurrentSession();
		session.delete(object);	
	}
	
	@Transactional
	public void update(Object object)	{
		Session session = getCurrentSession();
		session.update(object);
	}
	
	@Transactional
	public <T> T get(Class clazz, Serializable id)	{
		Session session = getCurrentSession();
		Object result = session.get(clazz, id);
		return (T)result;
	}
	
	@Transactional
	public <T> T get(String entity, Serializable id)	{
		Session session = getCurrentSession();
		Object result = session.get(entity, id);
		return (T)result;
	}
	
	@Transactional
	public <T extends Object> List<T> getListWithQuery(String queryString, Object... params)	{
		Session session = getCurrentSession();
		Query query = session.createQuery(queryString);
		for(int i = 0; i < params.length; ++i)	{
			query.setParameter(i, params[i]);
		}
		List<T> result = query.list();
		return result;
	}
	
	@Transactional
	public int excuteQuery(String queryString, Object... params)	{
		Session session = getCurrentSession();
		Query query = session.createQuery(queryString);
		for(int i = 0; i < params.length; ++i)	{
			query.setParameter(i, params[i]);
		}
		int rowNum = query.executeUpdate();
		
		return rowNum;
	}
	
	protected Session getCurrentSession()	{
		return factory.getCurrentSession();
	}
}
