package com.extensible.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamOmitField;

/**
 * 
 * @author Mario Junior
 *
 */
@XStreamAlias("event")
@Entity
@Table(name="EVENT")
public class Event implements Serializable
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id 
	@GeneratedValue
	private Integer id;
	
	@XStreamOmitField
	@ManyToOne //(targetEntity = Calendar.class)
	private Calendar calendar;
	
	@Column
	private String title;
	@Column @Temporal(value = TemporalType.TIMESTAMP)
	private Date startDate;

	@Column @Temporal(value = TemporalType.TIMESTAMP)
	private Date endDate;
	@Column
	private String rRule; //what's means?
	@Column
	private String location;
	@Column
	private String notes;
	@Column
	private String url;
	@Column
	private Boolean isAllDay;
	@Column
	private String reminder;
	
	
	/**
	 * @return the id
	 */
	public Integer getId()
	{
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id)
	{
		this.id = id;
	}
	/**
	 * @return the calendarId
	 */
	public Calendar getCalendar()
	{
		return calendar;
	}
	/**
	 * @param Calendar the calendar to set
	 */
	public void setCalendar(Calendar calendar)
	{
		this.calendar = calendar;
	}
	/**
	 * @return the title
	 */
	public String getTitle()
	{
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title)
	{
		this.title = title;
	}
	/**
	 * @return the startDate
	 */
	public Date getStartDate()
	{
		return startDate;
	}
	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate)
	{
		this.startDate = startDate;
	}
	/**
	 * @return the endDate
	 */
	public Date getEndDate()
	{
		return endDate;
	}
	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate)
	{
		this.endDate = endDate;
	}
	/**
	 * @return the rRule
	 */
	public String getrRule()
	{
		return rRule;
	}
	/**
	 * @param rRule the rRule to set
	 */
	public void setrRule(String rRule)
	{
		this.rRule = rRule;
	}
	/**
	 * @return the location
	 */
	public String getLocation()
	{
		return location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location)
	{
		this.location = location;
	}
	/**
	 * @return the notes
	 */
	public String getNotes()
	{
		return notes;
	}
	/**
	 * @param notes the notes to set
	 */
	public void setNotes(String notes)
	{
		this.notes = notes;
	}
	/**
	 * @return the url
	 */
	public String getUrl()
	{
		return url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url)
	{
		this.url = url;
	}
	/**
	 * @return the isAllDay
	 */
	public Boolean getIsAllDay()
	{
		return isAllDay;
	}
	/**
	 * @param isAllDay the isAllDay to set
	 */
	public void setIsAllDay(Boolean isAllDay)
	{
		this.isAllDay = isAllDay;
	}
	/**
	 * @return the reminder
	 */
	public String getReminder()
	{
		return reminder;
	}
	/**
	 * @param reminder the reminder to set
	 */
	public void setReminder(String reminder)
	{
		this.reminder = reminder;
	}
	
}
