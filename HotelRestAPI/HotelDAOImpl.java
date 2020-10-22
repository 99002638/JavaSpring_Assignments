package com.hotelapp.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hotelapp.model.Hotel;

@Service
public class HotelDAOImpl implements HotelDAO {

	@Override
	public List<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return showHotelList();
	}
	


	@Override
	public List<Hotel> getByCity(String city) {
		List<Hotel> newHotelList = new ArrayList<>();
		for(Hotel hotel : showHotelList()) {
			if(hotel.getByCity().equals(city))
				newHotelList.add(hotel);
		}
		return newHotelList;
	}

	@Override
	public Hotel getById(int id) {
		for(Hotel hotel : showHotelList()) {
			if(hotel.getById() == id)
		
		return hotel;
		}
		
		return null;
	}

	@Override
	public List<Hotel> getByCuisine(String cuisine) {
		List<Hotel> newHotelList = new ArrayList<>();
		for(Hotel hotel : showHotelList()) {
			if(hotel.getByCuisine().equals(cuisine))
				newHotelList.add(hotel);
		}
		return newHotelList;
	}
	
	
	 private List<Hotel> showHotelList(){
	    	return Arrays.asList(
	    			new Hotel("Mayura",22,"Mysore","Indian"),
	    			new Hotel("Palace",33,"Mumbai","chinese"),
	    			new Hotel("Vishnu",44,"Bangalore","Italian"),
	    			new Hotel("shalimar",55,"Salem","Indian"));
	    		
	    }

}
