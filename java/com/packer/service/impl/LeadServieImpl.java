package com.packer.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.packer.model.LeadEntity;
import com.packer.repo.LeadRepo;
import com.packer.service.api.LeadServiceApi;

@Service
public class LeadServieImpl implements LeadServiceApi {

	@Autowired
	private LeadRepo leadRepo;

	@Override
	public List<LeadEntity> getAllLeads() {
		// TODO Auto-generated method stub
		return leadRepo.findAll();
	}

	@Override
	public List<LeadEntity> getAllActiveLead() {
		// TODO Auto-generated method stub
		return leadRepo.findAllByActiveYNTrue();
	}

	@Override
	public List<LeadEntity> getAllFalseLeads() {
		// TODO Auto-generated method stub
		return leadRepo.findAllByActiveYNFalse();
	}

	@Override
	public LeadEntity saveLead(LeadEntity lead) {
		// TODO Auto-generated method stub
		return leadRepo.save(lead);
	}

	@Override
	public LeadEntity getLeadByLeadId(int id) {
		// TODO Auto-generated method stub
		return leadRepo.findByLeadId(id);
	}

}
