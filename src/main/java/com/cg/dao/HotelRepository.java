package com.cg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {

}
