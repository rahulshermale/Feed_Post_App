package com.example.serviceimpl;

import java.util.List;
import java.util.Optional;

import com.example.entity.Login;

public interface registerService {

	public List<Login> GetAll();
	public void AddUser(Login login);
	
	Optional<Login> userlogin(String name);
	
	public Login update(int id,Login login);
	void deleteById(int id);
	
	public Login getById(int id);
	List<Login> getUserByName(String name);
	
}
