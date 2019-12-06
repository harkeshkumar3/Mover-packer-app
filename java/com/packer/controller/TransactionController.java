package com.packer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.packer.model.TransationEntity;
import com.packer.service.api.TransationServiceApi;

@RestController
public class TransactionController {

	@Autowired
	private TransationServiceApi transationServiceApi;

	@GetMapping(value = "/getAllTransactionByUser/{userId}")
	public List<TransationEntity> getAllTransactionByUser(@PathVariable int userId){
		return transationServiceApi.getAllTransationByUser(userId);
	
	}
}
