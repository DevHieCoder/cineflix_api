package com.java.cineflix_api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "chitietphim")
public class ChiTietPhim {
	
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "id_phim")
	private Phim phim;
	
	@Column(name = "link_phim")
	private String linkPhim;
	
	@Column(name = "tap")
	private String tap;

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

	public String getLinkPhim() {
		return linkPhim;
	}

	public void setLinkPhim(String linkPhim) {
		this.linkPhim = linkPhim;
	}

	public String getTap() {
		return tap;
	}

	public void setTap(String tap) {
		this.tap = tap;
	}
	
}
