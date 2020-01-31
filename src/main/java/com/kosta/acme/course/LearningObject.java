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
package com.kosta.acme.course;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="LearningObject")
public class LearningObject implements Serializable {
	public LearningObject() {
	}
	
	@Column(name="Id", nullable=false, length=19)	
	@Id	
	@GeneratedValue(generator="COM_KOSTA_ACME_COURSE_LEARNINGOBJECT_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_KOSTA_ACME_COURSE_LEARNINGOBJECT_ID_GENERATOR", strategy="native")	
	private long id;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@Column(name="Description", nullable=true, length=255)	
	private String description;
	
	@ManyToMany(mappedBy="learningObjects", targetEntity= Course.class)
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set courses = new java.util.HashSet();
	
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
	
	public void setDescription(String value) {
		this.description = value;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setCourses(java.util.Set value) {
		this.courses = value;
	}
	
	public java.util.Set getCourses() {
		return courses;
	}
	
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
