package com.java.cineflix_api.entity;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name = "quocgia")
public class QuocGia {
	
	@Id
	@GeneratedValue
	private int id;
	
	@OneToMany(mappedBy = "quocGia")
	private Set<Phim> phims;
	
	@Column(name = "ten_quocgia")
	private String tenQuocGia;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTenQuocGia() {
		return tenQuocGia;
	}

	public void setTenQuocGia(String tenQuocGia) {
		this.tenQuocGia = tenQuocGia;
	}
	
}
