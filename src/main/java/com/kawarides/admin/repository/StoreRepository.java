package com.kawarides.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kawarides.admin.model.Store;

@Repository
public interface StoreRepository extends JpaRepository<Store,Long> {

}
