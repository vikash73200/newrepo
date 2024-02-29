package com.cg.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.dao.HotelRepository;
import com.cg.entity.Hotel;

@Service
public class HotelServiceImpl implements HotelService {
	@Autowired
  HotelRepository hotelRepo;
	@Override
	public Hotel create(Hotel hotel) {
		
		return hotelRepo.save(hotel);
	}
 
	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		List<Hotel> hotelList = hotelRepo.findAll();
		return hotelList;
	}
 
	@Override
	public Hotel getHotelById(String Id)  {
		// TODO Auto-generated method stub
		return getHotelById(Id);
	}
 
}