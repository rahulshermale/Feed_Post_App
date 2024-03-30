package com.example.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.UniqueConstraint;

@Entity
public class Login {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(unique = true)
	private String username;
	private int password;
//	@Column(unique = true)
	private String emailid;
	private Long moNo;
	private String role;
			//registerlog map with the feeds Table with log_id
	@OneToMany(mappedBy = "registerlog", cascade = CascadeType.ALL)
//	  @JsonBackReference
    private List<Feeds> feed ;//= new ArrayList<>();

	public int getId() {
		return id;
	}
	

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}

	public Long getMoNo() {
		return moNo;
	}

	public void setMoNo(Long moNo) {
		this.moNo = moNo;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

//	public List<Feeds> getFeed() {
//		return feed;
//	}

	
	public void setFeed(List<Feeds> feed) {
		this.feed = feed;
	}

	public Login(int id, String username, int password, String emailid, Long moNo, String role, List<Feeds> feed) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.emailid = emailid;
		this.moNo = moNo;
		this.role = role;
		this.feed = feed;
	}

	public Login() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Login [id=" + id + ", username=" + username + ", password=" + password + ", emailid=" + emailid
				+ ", moNo=" + moNo + ", role=" + role + ", feed=" + feed + "]";
	}

	
	
	
	
}
