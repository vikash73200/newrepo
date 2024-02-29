package com.cg.service;

import java.util.List;

import com.cg.entity.Hotel;

public interface HotelService {

	 Hotel create(Hotel hotel);
	
	 List<Hotel>getAllHotels();
	 Hotel getHotelById(String hotelId);
}
