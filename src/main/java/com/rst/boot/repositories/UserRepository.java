package com.rst.boot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rst.boot.models.UserModel;

public interface UserRepository extends JpaRepository<UserModel,Integer>{
	//getallusers
	//finduser
	//delete
	//update

}
