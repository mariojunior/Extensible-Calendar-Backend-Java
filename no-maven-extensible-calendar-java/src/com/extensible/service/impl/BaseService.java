package com.extensible.service.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * A Base Service class, with a SessionFactory injected by Spring 
 * and a Session getter providing access to Hibernate Session
 *   
 * @author Mario Junior
 *
 */
@Service
public class BaseService
{

	private SessionFactory session;

	@Autowired
	public void setSession(SessionFactory session)
	{
		this.session = session;
	}
	
	
	protected Session getSession()
	{
		return this.session.getCurrentSession();
	}

}
