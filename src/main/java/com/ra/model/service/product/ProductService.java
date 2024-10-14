package com.ra.model.service.product;

import com.ra.model.entity.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();

    Product getProductById(int id);

    boolean addProduct(Product product);

    boolean updateProduct(Product Product);

    void deleteProduct(int id);
}
