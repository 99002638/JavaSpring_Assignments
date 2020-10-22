package com.hotelapp.service;

import java.util.List;

import com.hotelapp.model.Hotel;

public interface HotelService {

	
	List<Hotel> getAllHotels();
	List<Hotel> getByCity(String city);
	Hotel getById(int id);
	List<Hotel> getByCuisine(String cuisine);
}
