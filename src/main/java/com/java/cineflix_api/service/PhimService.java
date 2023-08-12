package com.java.cineflix_api.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.cineflix_api.entity.Phim;
import com.java.cineflix_api.repository.PhimRepository;
import com.java.cineflix_api.serviceImp.PhimServiceImp;

@Service
public class PhimService implements PhimServiceImp{
	
	@Autowired
	PhimRepository phimRepository;
	
	@Override
	public List<Phim> getPhims() {
		// TODO Auto-generated method stub
		return phimRepository.findAll();
	}

	@Override
	public List<Map<String, ?>> getInfoPhim() {
		// TODO Auto-generated method stub
		return phimRepository.getInfoPhim();
	}

}
