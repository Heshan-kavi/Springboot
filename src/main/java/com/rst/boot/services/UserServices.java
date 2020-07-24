package com.rst.boot.services;

import java.util.List;

import com.rst.boot.models.UserModel;

public interface UserServices {
	
	List<UserModel> findAllUsers();

	String saveUser(UserModel userData);
	
}
