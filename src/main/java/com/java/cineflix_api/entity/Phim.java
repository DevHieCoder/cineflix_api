package com.java.cineflix_api.entity;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity(name = "phim")
public class Phim {
	
	@Id
	@GeneratedValue
	private long id;
	
	@ManyToOne
	@JoinColumn(name = "id_quocgia")
	private QuocGia quocGia;
	
	@OneToMany(mappedBy = "phim")
	private Set<ChiTietPhim> chiTietPhims;
	
	@OneToMany(mappedBy = "phim")
	private Set<LoaiPhimPhim> loaiPhimPhims;
	
	@Column(name = "mo_ta")
	private String moTa;
	
	@Column(name = "ngay_tao")
	private Date ngayTao;
	
	@Column(name = "ten_phim")
	private String tenPhim;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public QuocGia getQuocGia() {
		return quocGia;
	}

	public void setQuocGia(QuocGia quocGia) {
		this.quocGia = quocGia;
	}

	public String getMoTa() {
		return moTa;
	}

	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}

	public Date getNgayTao() {
		return ngayTao;
	}

	public void setNgayTao(Date ngayTao) {
		this.ngayTao = ngayTao;
	}

	public String getTenPhim() {
		return tenPhim;
	}

	public void setTenPhim(String tenPhim) {
		this.tenPhim = tenPhim;
	}
	
}
