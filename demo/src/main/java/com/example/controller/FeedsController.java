package com.example.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Feeds;
import com.example.entity.Login;
import com.example.serviceimpl.FeedsImplementation;

@RestController
@CrossOrigin("*")
public class FeedsController {
	@Autowired
	private FeedsImplementation feedimpl;

	@GetMapping(value = "/api/getfeed")
	public List<Feeds> getAllPost() {
		// TODO Auto-generated method stub
		return feedimpl.getAllPost();
	}
	

	@GetMapping(value = "/api/getByid/{id}")
	public Optional<Login> getuserById(@PathVariable int id) {

//		return feedimpl.getuserById(id);
return null;
	}
	
	
	
	@GetMapping(value = "/api/get")
	public List<Feeds> findAllUsersWithAddress() {
		// TODO Auto-generated method stub
		return feedimpl.findAllUsersWithAddress();
	}

	@PostMapping("api/addpostfeed/{id}")
	public void addPost(@RequestBody Feeds feed,@PathVariable int id) {
		
		System.err.println("Helllo..........."+ id );
		
		// TODO Auto-generated method stub
		
		feedimpl.addPost(feed,id);
//		System.err.println(id++);
//		return "End";
	}
	
	
	

	@DeleteMapping("api/deletebyid/{id}")
	public void deletbyId(@PathVariable int id) {
		// TODO Auto-generated method stub
		
		System.err.println(id);
		
		feedimpl.deletById(id);
	}
	
	@DeleteMapping("api/deleteallpost/")
	public void deletAllPost() {
		// TODO Auto-generated method stub
		feedimpl.deletAllPost();
		
		
		
	}
	
	@DeleteMapping("/api/delete/{id}")
    public String deleteUserByUsername(@PathVariable int id) {
		feedimpl.deleteUserByUsername(id);
        return "User with username " + id + " has been deleted successfully.";
    }
	
	
	
	

	 @GetMapping(value = "api/getallfeed/{id}")
	 public List<Feeds> getUserbyid(@PathVariable int id)
	 {
		return feedimpl.getUserByName(id);
	 }
	
}
