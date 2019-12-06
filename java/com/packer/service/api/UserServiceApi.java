package com.packer.service.api;

import java.util.List;

import org.springframework.stereotype.Service;

import com.packer.model.UserEntity;

@Service
public interface UserServiceApi {

	UserEntity saveUser(UserEntity user);

	List<UserEntity> getAllUserList();

	UserEntity getUserById(int id);

	UserEntity getUserByUserName(String username);

	Boolean isUserNameExits(String userName);

	Boolean isUserEmailExits(String email);

}
