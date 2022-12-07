package com.kawarides.admin.service;

import java.util.List;

import com.kawarides.admin.model.Categories;

public interface CategoryService {
 List<Categories> listCategory();
 Categories findone( Long id);
 Categories addCategories(Categories categories);
 String deleteCategories (Long id);
}
