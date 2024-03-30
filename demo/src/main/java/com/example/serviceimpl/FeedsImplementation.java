package com.example.serviceimpl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Feeds;
import com.example.entity.Login;
import com.example.entity.PostDetailsAndUserDetails;
import com.example.repository.FeedsRepository;
import com.example.repository.PostAndUserRepository;
import com.example.repository.RegisterRepo;

@Service
public class FeedsImplementation implements FeedsService {

	@Autowired
	private FeedsRepository feedpost;

	@Autowired
	private RegisterRepo regirepo;
	
	@Autowired
	private PostAndUserRepository postuserRepository;
	

	@Override
	public void addPost(Feeds feed, int id) {

		System.err.println("Helllo....2......." + id);

		Optional<Login> optionalLogin = regirepo.findById(id);
		System.out.println(regirepo.existsById(id));
		System.err.println("Helllo....3......." + id);

		if (optionalLogin.isPresent()) {
			System.err.println("Helllo....4......." + id++);
			// If Login entity exists, set it as the registerlog for the Feeds entity
			Login login = optionalLogin.get();

			System.out.println(login + "amar Akabar Anthony");
			feed.setRegisterlog(login);

			System.err.println(feed);

			feedpost.save(feed);

		}

	}

	@Override
	public List<Feeds> getAllPost() {
		// TODO Auto-generated method stub

		return feedpost.findAll();
	}

	@Override
	public Feeds updatePost(Feeds feed, int id) {
		// TODO Auto-generated method stub
//		return feedpost.save(feed,id);
		return null;
	}

	@Override
	public void deletById(int id) {
		feedpost.deleteById(id);
	}

	@Override
	public void deletAllPost() {
		// TODO Auto-generated method stub
		feedpost.deleteAll();
	}

	@Override
	public List<Feeds> findAllUsersWithAddress() {
		// TODO Auto-generated method stub

		return feedpost.findAll();
	}

	public void deleteUserByUsername(int id) {
		feedpost.deleteByUsername(id);
	}

	@Override
	public PostDetailsAndUserDetails getUserByjoin(int id) {
		// TODO Auto-generated method stub
		List<PostDetailsAndUserDetails> listjoin = new ArrayList<PostDetailsAndUserDetails>();


		
		PostDetailsAndUserDetails obj = new PostDetailsAndUserDetails();
		
		Feeds f = feedpost.getById(id);

		int a = f.getId();
		String post = f.getPost();
		int pass = f.getRegisterlog().getPassword();
		LocalDate date=f.getDate();
		String role=f.getRegisterlog().getRole();
		String username=f.getRegisterlog().getUsername();
		String name=f.getName();
		System.out.println(a + " Feedddddddddddddddddddd");
		System.out.println(post + " Feedddddddddddddddddddd");

		System.err.println(pass + " Prin t MEssage  feeddImmple");
		System.err.println(date + " Prin t MEssage  feeddImmple");
		System.err.println(role + " Prin t MEssage  feeddImmple");

		System.err.println(username + " Prin t MEssage  feeddImmple");
		
		obj.setUsername(username);
		obj.setDate(date);
		obj.setName(name);
		obj.setPost(post);
		obj.setRole(role);
		listjoin.add(obj);
		postuserRepository.save(obj);

		return postuserRepository.save(obj);
	}

	@Override
	public Feeds getUserByID(int id) {
		// TODO Auto-generated method stub

		feedpost.findById(id);

		return null;
	}

	@Override
	public List<Feeds> getUserByName(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
