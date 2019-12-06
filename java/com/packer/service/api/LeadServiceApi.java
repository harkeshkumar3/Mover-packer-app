package com.packer.service.api;

import java.util.List;

import org.springframework.stereotype.Service;

import com.packer.model.LeadEntity;

@Service
public interface LeadServiceApi {

	
	List<LeadEntity> getAllLeads();
	List<LeadEntity> getAllActiveLead();
	List<LeadEntity> getAllFalseLeads();
	
	LeadEntity saveLead(LeadEntity lead);
	
	LeadEntity getLeadByLeadId(int id);
	
	

}
