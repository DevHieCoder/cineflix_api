package com.java.cineflix_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.java.cineflix_api.entity.LoaiPhim;

@Repository
public interface CategoryRepository extends JpaRepository<LoaiPhim, Integer>{

}
