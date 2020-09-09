package com.bank.group7.composite.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.group7.composite.service.model.Composite;
import com.bank.group7.composite.service.repo.CompositeRepo;

@Service
public class CompositeService {
	
	@Autowired
	private CompositeRepo repo;
	
	public Composite createCart(Composite comp) {
		return repo.save(comp);
	}

	public int updateCart( Composite comp) {
		return repo.updateProdIdForCustomerId(comp.getCustId(), comp.getProdId());
	}

}
