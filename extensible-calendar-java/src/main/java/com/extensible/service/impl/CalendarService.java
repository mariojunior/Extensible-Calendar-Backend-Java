package com.extensible.service.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.springframework.stereotype.Service;

import com.extensible.model.Calendar;
import com.extensible.service.ICalendarService;

/**
 * CalendarService
 * Just a simple example acting as Repository layer for this example
 * 
 * @author Mario Junior
 *
 */
@Service
public class CalendarService extends BaseService implements ICalendarService
{
	
	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Calendar> list() throws Exception
	{
//		default SQL
//		SQLQuery query = getSession().createSQLQuery("select * from Calendar");
//
//		HQL (Hibernate Query Language)
		Query query = getSession().createQuery("from Calendar");
		return (List<Calendar>) query.list();
	}
	
	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public Calendar get(int id) throws Exception
	{
		Calendar cal = (Calendar) getSession().get(Calendar.class, id);
		return cal;
	}
	
	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void save(Calendar calendar) throws Exception
	{
		getSession().saveOrUpdate(calendar);
		getSession().flush();
	}
	
	/**
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void delete(Calendar calendar) throws Exception
	{
		getSession().delete(calendar);
		getSession().flush();
	}
	
}
