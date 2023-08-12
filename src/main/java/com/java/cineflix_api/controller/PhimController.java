package com.java.cineflix_api.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.java.cineflix_api.entity.Phim;
import com.java.cineflix_api.serviceImp.FileStorageServiceImp;
import com.java.cineflix_api.serviceImp.PhimServiceImp;

@RestController
@RequestMapping("/phims")
public class PhimController {

	@Autowired
	PhimServiceImp phimServiceImp;
	
	@Autowired
	FileStorageServiceImp fileStorageServiceImp;
	
	@GetMapping("")
	public ResponseEntity<?> getPhims() {
		List<Phim> listPhims = phimServiceImp.getPhims();
		
		return new ResponseEntity<List<Phim>>(listPhims, HttpStatus.OK);
	}
	
	@GetMapping("/infoPhim")
	public ResponseEntity<?> getInfoPhim() {
		List<Map<String, ?>> listInfoPhim = phimServiceImp.getInfoPhim();
		
		return new ResponseEntity<List<Map<String, ?>>>(listInfoPhim, HttpStatus.OK);
	}
	
	@PostMapping("")
	public ResponseEntity<?> insertPhim(@RequestParam("file") MultipartFile file) {
		fileStorageServiceImp.init();
		fileStorageServiceImp.saveFile(file);
		
		return new ResponseEntity<String>("", HttpStatus.OK);
	}
	
}	
