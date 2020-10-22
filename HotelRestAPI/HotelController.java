package com.hotelapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hotelapp.model.Hotel;
import com.hotelapp.service.HotelService;

@RestController
public class HotelController {
    @Autowired
	HotelService hotel_service;
    
    @GetMapping("/hotels")
    public List<Hotel> showAllHotels(){
    	return hotel_service.getAllHotels();
		
	}
    
    @GetMapping("/hotels-by-city/{city}")
    public List<Hotel> showByCity(@PathVariable("city")String city){
    	return hotel_service.getByCity(city);
		
	}
    
    
    @GetMapping("/hotels-by-cuisine/{cuisine}")
    public List<Hotel> showByCuisine(@PathVariable("cuisine")String cuisine){
    	return hotel_service.getByCuisine(cuisine);
		
	}
    
    
    @GetMapping("/hotels-by-id/{id}")
    Hotel  showById(@PathVariable("id")int id){
    	return hotel_service.getById(id);
		
	}
    

}
