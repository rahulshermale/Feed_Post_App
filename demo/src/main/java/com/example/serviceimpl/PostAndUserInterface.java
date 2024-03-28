package com.example.serviceimpl;

import java.util.List;
import java.util.Optional;

import com.example.entity.Login;
import com.example.entity.PostDetailsAndUserDetails;

public interface PostAndUserInterface {

	public List<PostDetailsAndUserDetails> GetAll();
	public void AddUser(Login login);
	
	Optional<PostDetailsAndUserDetails> userlogin(String name);
	
	public PostDetailsAndUserDetails update(int id,PostDetailsAndUserDetails login);
	void deleteById(int id);
	
	
	List<PostDetailsAndUserDetails> getUserByName(String name);
	Optional<PostDetailsAndUserDetails> getuserById(int id);
	void AddUserPost(PostDetailsAndUserDetails login);
	void AddUser(PostDetailsAndUserDetails login);
	
	
}
