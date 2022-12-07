package com.kawarides.admin.service;

import java.util.List;


import com.kawarides.admin.model.Store;

public interface StoreService {
	List<Store> listStore();
	 Store findone( Long storeId);
	 Store addStore(Store store);
	 String deleteStore (Long storeId);
}
