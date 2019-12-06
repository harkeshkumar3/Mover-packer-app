package com.packer.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.packer.model.LeadEntity;

@Repository
public interface LeadRepo extends JpaRepository<LeadEntity, Integer> {

	LeadEntity findByLeadId(int id);
	List<LeadEntity> findAllByActiveYNTrue();
	List<LeadEntity> findAllByActiveYNFalse();
	

}
