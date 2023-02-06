package com.app.service;

import java.util.List;
import javax.transaction.Transactional;

import org.springdoc.api.OpenApiResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.stereotype.Service;


import com.app.pojos.Vechile;
import com.app.repository.VechileRepository;
@Service
@Transactional
public class VechileServiceImpl implements VechileService {
	@Autowired
	private VechileRepository vechrepo;

	@Override
	public List<Vechile> getAllVechiles() {
		// TODO Auto-generated method stub
		return vechrepo.findAll();
	}

	@Override
	public Vechile addVechile(Vechile addvech) {
		// TODO Auto-generated method stub
		return vechrepo.save(addvech);
	}

	@Override
	public String deletebyid(Long id) {
		// TODO Auto-generated method stub
		if(vechrepo.existsById(id)) {
			vechrepo.deleteById(id);
			return "vechile Deleted Successfully";
		}
		return "Invalid Id vechile Deleteion Failed";
	}

	@Override
	public Vechile updateVechile(Vechile updatevech) {
		// TODO Auto-generated method stub
		if(vechrepo.existsById(updatevech.getId())) {
			return vechrepo.save(updatevech);
		}
		throw new OpenApiResourceNotFoundException("Invlid Id");
	}
	

}
