package com.springboot.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.VoterListEntity;
import com.springboot.service.VoterListService;

@RestController
@RequestMapping("/voterlist")
public class VoterListController {

	@Autowired
	private VoterListService voterListService;

	@PostMapping()
	public ResponseEntity<VoterListEntity> add(@RequestBody VoterListEntity voterList) {
		return new ResponseEntity<>(voterListService.saveVoterList(voterList), HttpStatus.CREATED);
	}

	@GetMapping()
	public List<VoterListEntity> getAllVoterList(VoterListEntity voterList) {
		return voterListService.getAllVoterDetails(voterList);
	}
	
	
	
	@GetMapping("/{id}")
	public Optional<VoterListEntity> getVoterById(@PathVariable int id) {
		return voterListService.getVoterById(id);
	}

	@GetMapping("/fullName/{name}")
	public List<VoterListEntity> getVoterByName(@PathVariable String name) {
		return voterListService.getVoterName(name);
	}

	@GetMapping("/fatherName/{fname}")
	public List<VoterListEntity> getVoterByFatherName(@PathVariable String fname) {
		return voterListService.getVoterFatherName(fname);
	}

	@GetMapping("/voterNumber/{vNum}")
	public ResponseEntity<List<VoterListEntity>> getVoterByVoterNum(@PathVariable String vNum) {
		return new ResponseEntity<>(voterListService.getVoterByNum(vNum), HttpStatus.FOUND);
	}

	@PutMapping("/{id}")
	public VoterListEntity updateVoterList(@RequestBody VoterListEntity voterList, @PathVariable int id) {
		voterList.setId(id);
		return voterListService.updateById(voterList);
	}

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable int id) {
		voterListService.deleteById(id);
	}

}
