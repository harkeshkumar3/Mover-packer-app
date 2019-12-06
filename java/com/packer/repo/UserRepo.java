package com.packer.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.packer.model.UserEntity;

@Repository
public interface UserRepo extends JpaRepository<UserEntity, Integer> {
	
	Boolean existsByUserName(String username);
	Boolean existsByEmail(String email);
	UserEntity findById(int id);
	 
	

}
