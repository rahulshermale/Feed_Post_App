package com.example.controller;
import java.util.Objects;
import java.util.ArrayList;
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
	
	
	


	@GetMapping(value = "api/getpost")
	public List<Login> getUserAllPost() {

		List<Login> aduser = new ArrayList<Login>();
		List<Login> lg = registerService.getUserAllPost();

		Login set = new Login();
		
		 for (Login obj : lg) {
					
			 
			 
			 int id = obj.getId();
				set.setId(id);

				String name = obj.getUsername();
				set.setUsername(name);

				String role = obj.getRole();
				set.setRole(role);

				String username1 = obj.getUsername();
				set.setUsername(username1);
				Long mono = obj.getMoNo();
				set.setMoNo(mono);

				int pass = obj.getPassword();
				set.setPassword(pass);

				String email = obj.getEmailid();
				set.setEmailid(email);

				aduser.add(set);
//				System.err.println(set);
				System.err.println(lg+"Adeeeeeeeeeeeeeeeeeed Useerrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrr");

//			 return registerService.getUserByName(username);
				return aduser;
			 

	        }


	

		return aduser;

	}


	@GetMapping(value = "api/getalluser/{username}")
	public Login getUserbyName(@PathVariable String username) {

		List<Login> aduser = new ArrayList<Login>();
		Login lg = registerService.getUserByName(username);

//					aduser.add(lg.getId());
		Login set = new Login();
		System.out.println("Helllo User    "+lg);
		
		if (!Objects.isNull(lg)) {
			int id = lg.getId();
			set.setId(id);

			String name = lg.getUsername();
			set.setUsername(name);

			String role = lg.getRole();
			set.setRole(role);

			String username1 = lg.getUsername();
			set.setUsername(username1);
			Long mono = lg.getMoNo();
			set.setMoNo(mono);

			int pass = lg.getPassword();
			set.setPassword(pass);

			String email = lg.getEmailid();
			set.setEmailid(email);

			aduser.add(set);
//			System.err.println(set);
			System.err.println("List Of User "+aduser);

//		 return registerService.getUserByName(username);
//			return aduser;
			
			
		}
		return set;

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
