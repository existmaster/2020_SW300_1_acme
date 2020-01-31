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
@Table(name="Course")
public class Course implements Serializable {
	public Course() {
	}
	
	@Column(name="ID", nullable=false, length=19)	
	@Id	
	@GeneratedValue(generator="COM_KOSTA_ACME_COURSE_COURSE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_KOSTA_ACME_COURSE_COURSE_ID_GENERATOR", strategy="native")	
	private long id;
	
	@Column(name="Title", nullable=true, length=255)	
	private String title;
	
	@Column(name="Duration", nullable=false, length=10)	
	private int duration;
	
	@Column(name="MaxEnrollment", nullable=false, length=10)	
	private int maxEnrollment;
	
	@Column(name="MinEnrollment", nullable=false, length=10)	
	private int minEnrollment;
	
	@Column(name="UnitPrice", nullable=false, length=10)	
	private float unitPrice;
	
	@ManyToMany(targetEntity=com.kosta.acme.course.LearningObject.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinTable(name="LearningObject_Course", joinColumns={ @JoinColumn(name="CourseID") }, inverseJoinColumns={ @JoinColumn(name="LearningObjectId") })	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set learningObjects = new java.util.HashSet();
	
	@OneToMany(mappedBy="course", targetEntity=com.kosta.acme.clazz.Clazz.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set clazzes = new java.util.HashSet();
	
	private void setId(long value) {
		this.id = value;
	}
	
	public long getId() {
		return id;
	}
	
	public long getORMID() {
		return getId();
	}
	
	public void setTitle(String value) {
		this.title = value;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setDuration(int value) {
		this.duration = value;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public void setMaxEnrollment(int value) {
		this.maxEnrollment = value;
	}
	
	public int getMaxEnrollment() {
		return maxEnrollment;
	}
	
	public void setMinEnrollment(int value) {
		this.minEnrollment = value;
	}
	
	public int getMinEnrollment() {
		return minEnrollment;
	}
	
	public void setUnitPrice(float value) {
		this.unitPrice = value;
	}
	
	public float getUnitPrice() {
		return unitPrice;
	}
	
	public void setLearningObjects(java.util.Set value) {
		this.learningObjects = value;
	}
	
	public java.util.Set getLearningObjects() {
		return learningObjects;
	}
	
	
	public void setClazzes(java.util.Set value) {
		this.clazzes = value;
	}
	
	public java.util.Set getClazzes() {
		return clazzes;
	}
	
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
