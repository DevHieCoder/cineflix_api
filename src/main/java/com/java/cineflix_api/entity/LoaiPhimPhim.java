package com.java.cineflix_api.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "loaiphim_phim")
public class LoaiPhimPhim {
	
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "id_phim")
	private Phim phim;
	
	@ManyToOne
	@JoinColumn(name = "id_loaiphim")
	private LoaiPhim loaiPhim;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Phim getPhim() {
		return phim;
	}

	public void setPhim(Phim phim) {
		this.phim = phim;
	}

	public LoaiPhim getLoaiPhim() {
		return loaiPhim;
	}

	public void setLoaiPhim(LoaiPhim loaiPhim) {
		this.loaiPhim = loaiPhim;
	}
	
}
