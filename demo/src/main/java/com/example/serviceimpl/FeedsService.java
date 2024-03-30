package com.example.serviceimpl;

import java.util.List;

import com.example.entity.Feeds;
import com.example.entity.PostDetailsAndUserDetails;

public interface FeedsService {

  public void addPost(Feeds feed ,int id);
	
	public List<Feeds> getAllPost();
	
	public List<Feeds> findAllUsersWithAddress();
	
	public Feeds updatePost(Feeds feed,int id);
	
	public void deletById(int id);
	
	public void deletAllPost();

	List<Feeds> getUserByName(int id);

	Feeds getUserByID(int id);

	PostDetailsAndUserDetails getUserByjoin(int id);
}

