package com.java.cineflix_api.serviceImp;

import java.util.List;
import java.util.Map;

import com.java.cineflix_api.entity.Phim;

public interface PhimServiceImp {
	public List<Phim> getPhims();
	public List<Map<String, ?>> getInfoPhim();
}
