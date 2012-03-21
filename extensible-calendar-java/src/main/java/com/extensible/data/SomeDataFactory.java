package com.extensible.data;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.extensible.model.Calendar;
import com.extensible.model.Event;
import com.extensible.service.ICalendarService;


/**
 * This class just create some data objects persisted on HSQLDB memory
 * on startup spring context application
 * 
 * 
 * @author Mario Junior
 *
 */
@Component
public class SomeDataFactory
{

	private ICalendarService service;
	
	/**
	 * @param service the service to set
	 */
	@Autowired
	public void setService(ICalendarService service)
	{
		this.service = service;
	}
	
	/**
	 * Create 10 Calendar object with 5 Events on each.
	 * @throws Exception
	 */
	@PostConstruct
	public void init() throws Exception{
		
		try
		{
			for (int i = 0; i < 10; i++)
			{
				Calendar cal = new Calendar();
				cal.setDescription("Testing my " + i + " calendar...");
				cal.setTitle("Test " + i);
				cal.setEvents(eventsFactory(i));
				
				service.save(cal);
			}
			
		} catch (Exception e)
		{
			throw e;
		}
	}
	
	/**
	 * A simple Event factory method.
	 * 
	 * @param index
	 * @return
	 */
	private List<Event> eventsFactory(int index)
	{
		List<Event> list = new ArrayList<Event>();
		
		for (int i=0; i < 5; i++)
		{
			Event evt = new Event();
			evt.setLocation("Event " + index + "." + i);
			evt.setTitle("title " + index + "." + i);
			
			java.util.Calendar startDate = java.util.Calendar.getInstance();
			evt.setStartDate(startDate.getTime());
			
			java.util.Calendar endDate = java.util.Calendar.getInstance();
			endDate.add(java.util.Calendar.DAY_OF_MONTH, i + 1);
			evt.setEndDate(endDate.getTime());
			
			list.add(evt);
		}
		
		return list;
	}



}
