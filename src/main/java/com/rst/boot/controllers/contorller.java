package com.rst.boot.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rst.boot.models.UserModel;
import com.rst.boot.services.UserServices;

@RestController
public class contorller {
	
	@Autowired
	private UserServices userServices;
	
	@GetMapping("/")
	public List<UserModel> hello() {
		return userServices.findAllUsers();
	}
	
	@PostMapping("/add")
	public String addUser(@RequestBody UserModel userdata) {
		return userServices.saveUser(userdata);
	}
}
