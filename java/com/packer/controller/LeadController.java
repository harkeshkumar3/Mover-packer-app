package com.packer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.packer.model.LeadEntity;
import com.packer.service.api.LeadServiceApi;

@RestController
public class LeadController {

	@Autowired
	private LeadServiceApi leadServiceApi;

	@GetMapping(value = "/getAllLeads")
	public List<LeadEntity> getAllLeads() {
		return leadServiceApi.getAllLeads();
	}

	@GetMapping(value = "/getAllActiveLeads")
	public List<LeadEntity> getAllActiveLeads() {
		return leadServiceApi.getAllActiveLead();
	}

	@GetMapping(value = "/getAllFalseLeads")
	public List<LeadEntity> getAllFalseLeads() {
		return leadServiceApi.getAllFalseLeads();
	}

	@PostMapping(value = "/saveLead")
	public LeadEntity saveLead(@RequestBody LeadEntity lead) {
		return leadServiceApi.saveLead(lead);
	}

}
