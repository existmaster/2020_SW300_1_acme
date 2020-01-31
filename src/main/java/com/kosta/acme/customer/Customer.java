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
package com.kosta.acme.customer;

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="Customer")
public class Customer implements Serializable {
	public Customer() {
	}
	
	@Column(name="Id", nullable=false, length=19)	
	@Id	
	@GeneratedValue(generator="COM_KOSTA_ACME_CUSTOMER_CUSTOMER_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_KOSTA_ACME_CUSTOMER_CUSTOMER_ID_GENERATOR", strategy="native")	
	private long id;
	
	@Column(name="FirstName", nullable=true, length=255)	
	private String firstName;
	
	@Column(name="LastName", nullable=true, length=255)	
	private String lastName;
	
	@Column(name="Job", nullable=true, length=255)	
	private String job;
	
	@Column(name="Industry", nullable=true, length=255)	
	private String industry;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Phone", nullable=true, length=255)	
	private String phone;
	
	@Column(name="Membership", nullable=false)	
	private boolean membership;
	
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
	
	public void setJob(String value) {
		this.job = value;
	}
	
	public String getJob() {
		return job;
	}
	
	public void setIndustry(String value) {
		this.industry = value;
	}
	
	public String getIndustry() {
		return industry;
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
	
	public void setMembership(boolean value) {
		this.membership = value;
	}
	
	public boolean getMembership() {
		return membership;
	}
	
	public String toString() {
		return String.valueOf(getId());
	}
	
}
