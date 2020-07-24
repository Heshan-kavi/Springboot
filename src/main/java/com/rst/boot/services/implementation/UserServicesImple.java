package com.rst.boot.services.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rst.boot.models.UserModel;
import com.rst.boot.repositories.UserRepository;
import com.rst.boot.services.UserServices;

@Service
public class UserServicesImple implements UserServices{
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public List<UserModel> findAllUsers() {
		List<UserModel> allusers = userRepository.findAll();
		return allusers;
	}

	@Override
	public String saveUser(UserModel userData) {
		// TODO Auto-generated method stub
		userRepository.save(userData);
		return "Data saved";
	}
	
	
}
