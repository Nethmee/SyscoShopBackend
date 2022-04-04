package com.example.demo.services;

import com.example.demo.dto.ProductDTO;
import com.example.demo.dto.ResponseDTO;

public interface ProductService {
    ResponseDTO<ProductDTO> getAllProducts();

    ResponseDTO<ProductDTO> getProductsByCategory(String categoryName);
}
