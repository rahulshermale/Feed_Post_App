package com.example.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Login;
import com.example.entity.PostDetailsAndUserDetails;
import com.example.repository.PostAndUserRepository;

@Service
public class PostAndUserImplementation implements PostAndUserInterface{

	@Autowired
	private PostAndUserRepository postuserRepository;
	
	@Override
	public List<PostDetailsAndUserDetails> GetAll() {
		// TODO Auto-generated method stub
		return postuserRepository.findAll();
	}

	@Override
	public void AddUserPost(PostDetailsAndUserDetails postuser) {
		// TODO Auto-generated method stub
		postuserRepository.save(postuser);
	}

	@Override
	public Optional<PostDetailsAndUserDetails> userlogin(String name) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public PostDetailsAndUserDetails update(int id, PostDetailsAndUserDetails login) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
		postuserRepository.deleteById(id);
	}

	@Override
	public Optional<PostDetailsAndUserDetails> getuserById(int id) {
		// TODO Auto-generated method stub
		return postuserRepository.findById(id);
	}

	@Override
	public List<PostDetailsAndUserDetails> getUserByName(String username) {
		// TODO Auto-generated method stub
		return postuserRepository.getUserList(username);
//		return null;
	}
	
	

	public PostDetailsAndUserDetails updateUser(int id, PostDetailsAndUserDetails user) {
		// TODO Auto-generated method stub
		if(postuserRepository.existsById(id)) {
			user.setPid(id);
			
			return postuserRepository.save(user);
		}
		
		
		return null;
	}

	@Override
	public void AddUser(PostDetailsAndUserDetails login) {
		// TODO Auto-generated method stub
		postuserRepository.save(login);
	}

	@Override
	public void AddUser(Login login) {
		// TODO Auto-generated method stub
		
	}

}
