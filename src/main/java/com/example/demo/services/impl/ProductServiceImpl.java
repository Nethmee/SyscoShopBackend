package com.example.demo.services.impl;

import com.example.demo.dto.ProductDTO;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.model.Product;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    CategoryRepository categoryRepository;

    @Override
    public ResponseDTO<ProductDTO> getAllProducts() {
        ResponseDTO responseDTO;
        List<Product> allProducts = productRepository.findAll();

        if(Objects.nonNull(allProducts)){

    ProductDTO productDTO = new ProductDTO();
    productDTO.setListofProducts(allProducts);
            responseDTO= new ResponseDTO <>("All the products","success!",productDTO);

}
        else{
            responseDTO= new ResponseDTO <>("All products fetch fail","Fail!",null);
        }






        return responseDTO;
    }

    @Override
    public ResponseDTO<ProductDTO> getProductsByCategory(String categoryName) {
        ResponseDTO responseDTO;
        List<Product> allProducts = productRepository.getAllProductsOfCategory(categoryName);
        return null;
    }
}
