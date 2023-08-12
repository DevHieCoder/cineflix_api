package com.java.cineflix_api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.cineflix_api.entity.LoaiPhim;
import com.java.cineflix_api.repository.CategoryRepository;
import com.java.cineflix_api.serviceImp.CategoryServiceImp;

@Service
public class CategoryService implements CategoryServiceImp{

	@Autowired
	CategoryRepository categoryRepository;
	
	@Override
	public List<LoaiPhim> loaiPhims() {
		// TODO Auto-generated method stub
		return categoryRepository.findAll();
	}

}
