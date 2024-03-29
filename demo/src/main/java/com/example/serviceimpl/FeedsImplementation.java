package com.example.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Feeds;
import com.example.entity.Login;
import com.example.repository.FeedsRepository;
import com.example.repository.RegisterRepo;

@Service
public class FeedsImplementation implements FeedsService{

	@Autowired
	private FeedsRepository feedpost;
	
	@Autowired
	private RegisterRepo regirepo;
	
	@Override
	public void addPost(Feeds feed ,int id) {

		System.err.println("Helllo....2......."+ id );


			Optional<Login> optionalLogin = regirepo.findById(id);
			System.out.println(regirepo.existsById(id));
			System.err.println("Helllo....3......."+ id);
        
            if (optionalLogin.isPresent()) {
        	System.err.println("Helllo....4......."+ id++ );
            // If Login entity exists, set it as the registerlog for the Feeds entity
            Login login = optionalLogin.get();

            System.out.println(login+"amar Akabar Anthony");
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
	public List<Feeds> getUserByName(int id) {
		// TODO Auto-generated method stub
		return feedpost.listtype(id);
//		return null;
		
	}

}
