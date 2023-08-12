package com.java.cineflix_api.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "loaiphim")
public class LoaiPhim {	
	
	@Id
	@GeneratedValue
	private int id;
	
	@OneToMany(mappedBy = "loaiPhim")
	private Set<LoaiPhimPhim> loaiPhimPhims;
	
	@Column(name = "ten_loai")
	private String tenLoai;
	
	@Column(name = "hinh_anh")
	private String hinhAnh;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenLoai() {
		return tenLoai;
	}

	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}

	public String getHinhAnh() {
		return hinhAnh;
	}

	public void setHinhAnh(String hinhAnh) {
		this.hinhAnh = hinhAnh;
	}
	
}
