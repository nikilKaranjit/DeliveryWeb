package com.kawarides.admin.service;

import java.util.List;

import com.kawarides.admin.model.User;
import com.kawarides.admin.model.Zone;

public interface ZoneService {
	List<Zone> zoneList();
	User findOne(Long zoneId);
	
	
}
