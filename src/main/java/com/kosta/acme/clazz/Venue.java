/**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: 
 * License Type: Evaluation
 */
package com.kosta.acme.clazz;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Venue")
public class Venue implements Serializable {
	public Venue() {
	}
	
	@Column(name="Id", nullable=false, length=19)	
	@Id	
	@GeneratedValue(generator="COM_KOSTA_ACME_CLAZZ_VENUE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_KOSTA_ACME_CLAZZ_VENUE_ID_GENERATOR", strategy="native")	
	private long id;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@Column(name="Address", nullable=true, length=255)	
	private String address;
	
	@Column(name="Capacity", nullable=false, length=10)	
	private int capacity;
	
	@Column(name="Map", nullable=true, length=255)	
	private String map;
	
	@OneToMany(mappedBy="venue", targetEntity=com.kosta.acme.clazz.ClazzDay.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set clazzDaies = new java.util.HashSet();
	
	private void setId(long value) {
		this.id = value;
	}
	
	public long getId() {
		return id;
	}
	
	public long getORMID() {
		return getId();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setAddress(String value) {
		this.address = value;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setCapacity(int value) {
		this.capacity = value;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setMap(String value) {
		this.map = value;
	}
	
	public String getMap() {
		return map;
	}
	
	public void setClazzDaies(java.util.Set value) {
		this.clazzDaies = value;
	}
	
	public java.util.Set getClazzDaies() {
		return clazzDaies;
	}
	
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
