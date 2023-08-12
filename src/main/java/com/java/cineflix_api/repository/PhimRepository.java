package com.java.cineflix_api.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.java.cineflix_api.entity.Phim;

@Repository
public interface PhimRepository extends JpaRepository<Phim, Long>{
	@Query(value = "call InfoPhim()", nativeQuery = true)
	List<Map<String, ?>> getInfoPhim();
}
