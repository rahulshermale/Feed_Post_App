package com.example.entity;

import java.time.LocalDate;

import org.hibernate.annotations.GeneratorType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class PostDetailsAndUserDetails {

	@Id
	private int pid;
	private LocalDate date;
	private String post;
	private String name;
	private String username;
	private String role;
	
	
	
	
	
	@Override
	public String toString() {
		return "PostDetailsAndUserDetails [pid=" + pid + ", date=" + date + ", post=" + post + ", name=" + name
				+ ", username=" + username + ", role=" + role + "]";
	}



	public PostDetailsAndUserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getPid() {
		return pid;
	}



	public void setPid(int pid) {
		this.pid = pid;
	}



	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	public String getPost() {
		return post;
	}



	public void setPost(String post) {
		this.post = post;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getRole() {
		return role;
	}



	public void setRole(String role) {
		this.role = role;
	}



	public PostDetailsAndUserDetails(int pid, LocalDate date, String post, String name, String username, String role) {
		super();
		this.pid = pid;
		this.date = date;
		this.post = post;
		this.name = name;
		this.username = username;
		this.role = role;
	}
	
	
}
