/**
 * 2015. 11. 7.
 * Copyright by yyh / Hubigo AIAL
 * TestControllerTest.java
 */
package com.warmcompany.udong.test.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.warmcompany.udong.test.model.Member;

public class TestControllerTest {

	@Autowired
	SessionFactory factory;
	
	@Test
	public void test() {
		
		System.out.println("상입 작업");
		Member member = new Member("test", "test2");
		
		Session session = factory.getCurrentSession();
		session.beginTransaction();
		session.save(member);
		session.getTransaction().commit();
		
	}

}
