package com.example.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.entity.Login;
import com.example.repository.RegisterRepo;

@Service
public class registerImpl implements registerService {

	@Autowired
	private RegisterRepo regirepo;
	
	@Override
	public List<Login> GetAll() {
		// TODO Auto-generated method stub
		return regirepo.findAll();
	}

	public Optional<Login> getuserById(int id) {
		// TODO Auto-generated method stub
		return regirepo.findById(id);
	}
	
	@Override
	public List<Login> getUserByName(String name) {
		// TODO Auto-generated method stub
		return regirepo.listtype(name);
//		return null;
		
	}

	
	@Override
	public void AddUser(Login login) {
		// TODO Auto-generated method stub
		regirepo.save(login);
	
	}

	@Override
	public void deleteById(int id) {
		// TODO Auto-generated method stub
		 regirepo.deleteById(id);
		
	}
	@Override
	public Optional<Login> userlogin(String name) {
		// TODO Auto-generated method stub
		return regirepo.findByUsername(name);
	}

	@Override
	public Login update(int id, Login login) {
		// TODO Auto-generated method stub
		
		return regirepo.save(login);
		
	}

	

	public Login updateUser(int id, Login user) {
        if (regirepo.existsById(id)) {
            user.setId(id);
            return regirepo.save(user);
        }
        return null;
    }

	public List<Login> getSelected(String username) {
		// TODO Auto-generated method stub
		
		regirepo.findByUsername(username);
		
		return null;
	}

	@Override
	public Login getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	


	

}
