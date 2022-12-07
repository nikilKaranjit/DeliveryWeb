package com.kawarides.admin.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.kawarides.admin.model.Products;

@Repository
public interface ProductRepository extends JpaRepository<Products,Long> {

	@Query("select p from Products p where p.productName like %:keyword% order by p.productId asc")
	List<Products> findProducts(@Param("keyword")String keyword);
}
