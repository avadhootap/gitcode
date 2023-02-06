package com.app.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Vechile;
import com.app.service.VechileService;

@RestController
@RequestMapping("/vechiles")
public class VechileController {
	@Autowired
	private VechileService vechserv;

	public VechileController() {
		System.out.println("in vech controller constr");
	}
	
	@GetMapping
	List<Vechile>getAllVechiles(){
		return vechserv.getAllVechiles();
	}
	@PostMapping
	Vechile addAllVechiles(@RequestBody Vechile addvech){
		return vechserv.addVechile(addvech);
	}
	
	@DeleteMapping("/{id}")
	String deletevechilebyid(@PathVariable Long id) {
		return vechserv.deletebyid(id);
	}
	
	@PutMapping
	Vechile UpadteVechile(@RequestBody Vechile updateVechile) {
		return vechserv.updateVechile(updateVechile);
	}
	
	

}
