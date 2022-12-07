package com.kawarides.admin.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kawarides.admin.model.User;
import com.kawarides.admin.model.Zone;
import com.kawarides.admin.repository.ZoneRepository;
import com.kawarides.admin.service.ZoneService;

@Service
public class ZoneServiceImpl implements ZoneService {

	private ZoneRepository zoneRepository;
	
	@Autowired
	public ZoneServiceImpl(ZoneRepository zoneRepository) {
		super();
		this.zoneRepository = zoneRepository;
	}

	@Override
	public List<Zone> zoneList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findOne(Long zoneId) {
		// TODO Auto-generated method stub
		return null;
	}

}
