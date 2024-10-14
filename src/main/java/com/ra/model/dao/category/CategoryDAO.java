package com.ra.model.dao.category;

import com.ra.model.entity.Category;

import java.util.List;

public interface CategoryDAO {
    List<Category> getAllCategories();

    Category getCategoryById(int id);

    boolean addCategory(Category category);

    boolean updateCategory(Category category);

    void deleteCategory(int id);
}
