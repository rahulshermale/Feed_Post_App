package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Login;
import com.example.serviceimpl.registerImpl;

@RestController
@CrossOrigin("*")
public class RegistrationController {

	@Autowired
	private registerImpl registerService;

	@GetMapping(value = "/api/getall")
	public List<Login> getAll() {

		return registerService.GetAll();

	}
	@GetMapping(value = "/api/getallid/{id}")
	public Optional<Login> getuserById(@PathVariable int id) {

		return registerService.getuserById(id);

	}
	

	 @GetMapping(value = "api/getall/{username}")
	 public List<Login> getUserbyName(@PathVariable String username)
	 {
		return registerService.getUserByName(username);
	 }
	

	

	
	@PostMapping("/api/add")
	public void registerfeed(@RequestBody Login login) { 

		
		registerService.AddUser(login);
		

	}
//	@PostMapping("/api/update/{id}")
//	public void UpdateData(@PathVariable int id, @RequestBody Login login) {
//		
//		registerService.update(id, login);
//		
//		
//	}
	@PutMapping("/api/update/{id}")
    public Login updateUser(@PathVariable int id, @RequestBody Login user) {
        return registerService.updateUser(id, user);
    }
	

@DeleteMapping("/api/deleteuser/{id}")
public void deleteById(@PathVariable int id) {
	
	registerService.deleteById(id);
	
	
	
}


	
	
	
	
	
	
	
	
//	@GetMapping("/api/getbyid/{id}")
//	public List<Login> login(@PathVariable int id){
//	
//		registerService.userlogin(String user);
//	
//	}
//	
	@GetMapping(value = "api/userlogin/{uname}")
	public Optional<Login> slogin(@PathVariable String uname) {
//
		Optional<Login> s = registerService.userlogin(uname);
		return s;
		
	
	}	
	
	
		
}
