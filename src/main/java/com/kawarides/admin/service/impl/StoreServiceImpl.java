package com.kawarides.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kawarides.admin.model.Store;
import com.kawarides.admin.repository.StoreRepository;
import com.kawarides.admin.service.StoreService;

@Service
public class StoreServiceImpl implements StoreService {

	private StoreRepository storeRepository;
	
	
	@Autowired
	public StoreServiceImpl(StoreRepository storeRepository) {
		super();
		this.storeRepository = storeRepository;
	}

	@Override
	public List<Store> listStore() {
		// TODO Auto-generated method stub
		return storeRepository.findAll();
	}

	@Override
	public Store findone(Long storeId) {
		// TODO Auto-generated method stub
		return storeRepository.findOne(storeId);
	}

	@Override
	public Store addStore(Store store) {
		// TODO Auto-generated method stub
		return storeRepository.save(store);
	}

	@Override
	public String deleteStore(Long storeId) {
		// TODO Auto-generated method stub
		storeRepository.delete(storeId);
		return "Store deleted";
	}

}
