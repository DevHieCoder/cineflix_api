package com.java.cineflix_api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.cineflix_api.entity.LoaiPhim;
import com.java.cineflix_api.serviceImp.CategoryServiceImp;

@RestController
@RequestMapping("/category")
public class CategoryController {
	
	@Autowired
	CategoryServiceImp categoryServiceImp;
	
	@GetMapping("")
	public ResponseEntity<?> getCategory() {
		List<LoaiPhim> loaiPhims = categoryServiceImp.loaiPhims();
		
		return new ResponseEntity<List<LoaiPhim>>(loaiPhims, HttpStatus.OK);
	}
	
}
