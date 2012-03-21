package com.extensible.service;

import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.extensible.model.Calendar;

/**
 * Interface for CalendarService to standardize 
 * 
 * @author Mario Junior
 *
 */
@Transactional
public interface ICalendarService
{
	/**
	 * Return a list of Calendar objects stored on database
	 * 
	 * @return
	 * @throws Exception
	 */
	@Transactional(readOnly=true)
	List<Calendar> list() throws Exception;

	/**
	 * Return a specifc Calendar object catched by your id key
	 * 
	 * @param id calendar's key on database
	 * @return Calendar object
	 * @throws Exception
	 */
	@Transactional(readOnly=true)
	Calendar get(int id) throws Exception;

	/**
	 * Store/Persist a Calendar object on database.
	 * 
	 * @param calendar object to persist
	 * @throws Exception
	 */
	@Transactional(propagation=Propagation.REQUIRED)
	void save(Calendar calendar) throws Exception;
	
	/**
	 * Delete/Remove a Calendar object from our database.
	 * 
	 * @param calendar
	 * @throws Exception
	 */
	@Transactional(propagation=Propagation.REQUIRED)
	void delete(Calendar calendar) throws Exception;

}
