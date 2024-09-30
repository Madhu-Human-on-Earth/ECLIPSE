package com.jpa.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ThreeJs")
public class User {
	
	@Id
	private int id;
	private String email;
	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public User() {
		super();
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public User(int id, String email) {
		super();
		this.id = id;
		this.email = email;
	}
	
	

}
