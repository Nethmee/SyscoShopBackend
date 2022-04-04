package com.example.demo.repository;
import com.example.demo.model.Product;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ProductRepository extends JpaRepository  < Product, Long>{

    //all CRUD methods
    @Query(value = "SELECT * FROM (SELECT * FROM products INNER JOIN category WHERE products.cat_id=category.cat_id) WHERE category_name=:categoryName")
    List<Product> getAllProductsOfCategory(String categoryName);
}
