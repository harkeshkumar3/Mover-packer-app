package com.packer.service.api;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.packer.model.TransationEntity;

@Service
public interface TransationServiceApi {

	public List<TransationEntity> getAllTransationByUser(int userId);

	public List<TransationEntity> getAllTransationBetween(Date start, Date end);

	public TransationEntity saveTrans(TransationEntity trans);

	public TransationEntity getTransationById(int id);

}
