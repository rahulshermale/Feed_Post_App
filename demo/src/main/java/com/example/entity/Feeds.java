package com.example.entity;



import java.time.LocalDate;


//import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Feeds {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int feedId;
	
	
	private int id;
	
	
	private String post;
	
	
	private String name;
	
	private LocalDate date;

	  @ManyToOne
	  @JoinColumn(name = "log_id" , nullable = false)
	  private Login registerlog;

	  
	  
	  
	  
	  
	  
	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public int getFeedId() {
		return feedId;
	}



	
	public void setFeedId(int feedId) {
		this.feedId = feedId;
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



	public LocalDate getDate() {
		return date;
	}



	public void setDate(LocalDate date) {
		this.date = date;
	}



	public Login getRegisterlog() {
		return registerlog;
	}



	public void setRegisterlog(Login registerlog) {
		this.registerlog = registerlog;
	}



	public Feeds(int feedId, String post, String name, LocalDate date, Login registerlog) {
		super();
		this.feedId = feedId;
		this.post = post;
		this.name = name;
		this.date = date;
		this.registerlog = registerlog;
	}



	public Feeds() {
		super();
		// TODO Auto-generated constructor stub
	}




//	@Override
//	public String toString() {
//		return "Feeds [feedId=" + feedId + ", id=" + id + ", post=" + post + ", name=" + name + ", date=" + date
//				+ ", registerlog=" + registerlog + "]";
//	}
//	
	
	
	
}
