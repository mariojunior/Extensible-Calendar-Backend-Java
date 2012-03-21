package com.extensible.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 
 * @author Mario Junior
 *
 */
@XStreamAlias("calendar")
@Entity
@Table(name="CALENDAR")
public class Calendar implements Serializable
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	@Id 
	@GeneratedValue
	private Integer id;
	
	@Column
	private String title;

	@Column
	private String description;

	@Column
	private int color;
	
	@Column
	private Boolean isHidden;
	
	@XStreamAlias("events")
	@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)//EAGER only in samples! Not on production/real world
	private List<Event> events;
	
	
	
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
	 * @return the description
	 */
	public String getDescription()
	{
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description)
	{
		this.description = description;
	}
	/**
	 * @return the color
	 */
	public int getColor()
	{
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(int color)
	{
		this.color = color;
	}
	/**
	 * @return the isHidden
	 */
	public Boolean getIsHidden()
	{
		return isHidden;
	}
	/**
	 * @param isHidden the isHidden to set
	 */
	public void setIsHidden(Boolean isHidden)
	{
		this.isHidden = isHidden;
	}
	/**
	 * @return the events
	 */
	public List<Event> getEvents()
	{
		return events;
	}
	/**
	 * @param events the events to set
	 */
	public void setEvents(List<Event> events)
	{
		this.events = events;
	}
	
	
}
