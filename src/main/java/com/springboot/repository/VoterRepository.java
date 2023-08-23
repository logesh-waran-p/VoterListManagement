package com.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.entity.VoterListEntity;

@Repository
public interface VoterRepository extends JpaRepository<VoterListEntity, Integer>{
	
	public List<VoterListEntity> findByfullName(String name);
	public List<VoterListEntity> findByfatherName(String name);
	public List<VoterListEntity> findByvoterNum(String vNum);
}
