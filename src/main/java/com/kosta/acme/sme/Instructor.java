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
package com.kosta.acme.sme;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Instructor")
public class Instructor implements Serializable {
	public Instructor() {
	}
	
	@Column(name="Id", nullable=false, length=19)	
	@Id	
	@GeneratedValue(generator="COM_KOSTA_ACME_SME_INSTRUCTOR_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_KOSTA_ACME_SME_INSTRUCTOR_ID_GENERATOR", strategy="native")	
	private long id;
	
	@Column(name="FirstName", nullable=true, length=255)	
	private String firstName;
	
	@Column(name="LastName", nullable=true, length=255)	
	private String lastName;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Phone", nullable=true, length=255)	
	private String phone;
	
	@Column(name="HighestEducation", nullable=true, length=255)	
	private String highestEducation;
	
	@Column(name="BankAccount", nullable=true, length=255)	
	private String bankAccount;
	
	@ManyToMany(mappedBy="instructors", targetEntity=com.kosta.acme.clazz.ClazzDay.class)	
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
	
	public void setFirstName(String value) {
		this.firstName = value;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String value) {
		this.lastName = value;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPhone(String value) {
		this.phone = value;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setHighestEducation(String value) {
		this.highestEducation = value;
	}
	
	public String getHighestEducation() {
		return highestEducation;
	}
	
	public void setBankAccount(String value) {
		this.bankAccount = value;
	}
	
	public String getBankAccount() {
		return bankAccount;
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
