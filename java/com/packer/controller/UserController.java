package com.packer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.packer.model.UserEntity;
import com.packer.service.api.UserServiceApi;

@RestController
public class UserController {

	@Autowired
	private UserServiceApi userServiceApi;

	@GetMapping(value = "/getAllUser")
	public List<UserEntity> getAllUserList() {

		return userServiceApi.getAllUserList();
	}

}
