package com.extensible.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.extensible.model.Calendar;
import com.extensible.service.ICalendarService;

/**
 * This class just mediate all requests to http://<server>/<app>/calendar
 * defined on @RequestMapping annotation.
 * 
 * 
 * @author Mario Junior
 *
 */
@Controller
@RequestMapping("/calendar")
public class CalendarController
{
	private final Logger logger = LoggerFactory.getLogger(CalendarController.class);

	
	@Autowired
	private ICalendarService service;
	
	/**
	 * @param service the service to set
	 */
	public void setService(ICalendarService service)
	{
		this.service = service;
	}
	
	/**
	 * Intercept the request for the root of controller
	 * and write a List of Calendar Objects.
	 * 
	 * Remember that spring mediate the view using the ContentNegotiatingViewResolver pattern.
	 * see more info on:
	 * - http://www.mkyong.com/spring-mvc/spring-3-mvc-contentnegotiatingviewresolver-example/
	 * - http://www.mkyong.com/spring-mvc/spring-3-mvc-and-json-example/
	 * 
	 * @return Calendar's list
	 * @throws Exception
	 */
	@RequestMapping(method = RequestMethod.GET)
	public List<Calendar> list() throws Exception
	{
		return service.list();
	}

}
