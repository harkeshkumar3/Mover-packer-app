package com.packer.repo;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.packer.model.TransationEntity;

@Repository
public interface TransationRepo extends JpaRepository<TransationEntity, Integer> {

	public List<TransationEntity> findAllByUserId(int id);

	public TransationEntity findById(int id);

	public List<TransationEntity> findByTransationDateBetween(Date start, Date end);

}
