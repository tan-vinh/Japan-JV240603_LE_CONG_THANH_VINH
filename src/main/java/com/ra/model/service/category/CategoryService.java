package com.ra.model.service.category;

import com.ra.model.entity.Category;

import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();

    Category getCategoryById(int id);

    boolean addCategory(Category category);

    boolean updateCategory(Category category);

    void deleteCategory(int id);
}
