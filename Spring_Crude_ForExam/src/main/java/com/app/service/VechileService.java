package com.app.service;

import java.util.List;

import com.app.pojos.Vechile;

public interface VechileService {
	
	List<Vechile>getAllVechiles();
	
	Vechile addVechile(Vechile addvech);
	
	String deletebyid(Long id);
	
	Vechile updateVechile(Vechile updatevech);
	
	

}
