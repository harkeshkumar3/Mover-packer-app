package com.packer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packer.model.UserEntity;
import com.packer.repo.UserRepo;
import com.packer.service.api.UserServiceApi;

@Service
public class UserServiceImpl implements UserServiceApi {
	
	@Autowired
	private UserRepo userRepo;

	public UserEntity saveUser(UserEntity user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	public List<UserEntity> getAllUserList() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	public UserEntity getUserById(int id) {
		// TODO Auto-generated method stub
		return userRepo.findById(id);
	}

	public UserEntity getUserByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean isUserNameExits(String userName) {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean isUserEmailExits(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
