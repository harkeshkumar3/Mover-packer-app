package com.packer.service.impl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packer.model.TransationEntity;
import com.packer.repo.TransationRepo;
import com.packer.service.api.TransationServiceApi;
@Service
public class TransationServiceImpl implements TransationServiceApi {
	
	@Autowired
	private TransationRepo transRepo;
	

	@Override
	public List<TransationEntity> getAllTransationByUser(int userId) {
		// TODO Auto-generated method stub
		return transRepo.findAllByUserId(userId);
	}

	@Override
	public List<TransationEntity> getAllTransationBetween(Date start, Date end) {
		// TODO Auto-generated method stub
		return transRepo.findByTransationDateBetween(start, end);
	}

	@Override
	public TransationEntity saveTrans(TransationEntity trans) {
		// TODO Auto-generated method stub
		return transRepo.save(trans);
	}

	@Override
	public TransationEntity getTransationById(int id) {
		// TODO Auto-generated method stub
		return transRepo.findById(id);
	}

}
