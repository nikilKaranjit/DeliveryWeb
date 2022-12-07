package com.kawarides.admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.kawarides.admin.model.Categories;
import com.kawarides.admin.model.Products;

public interface CategoryRepository extends JpaRepository<Categories,Long> {

}
