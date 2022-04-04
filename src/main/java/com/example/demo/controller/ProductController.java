package com.example.demo.controller;

import com.example.demo.dto.ProductDTO;
import com.example.demo.dto.ResponseDTO;
import com.example.demo.exception.ResourceNotFoundException;
import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.services.ProductService;
import com.example.demo.util.RequestEndPoints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController

@RequestMapping("/api/v1/ProductController")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;
    @Autowired
    ProductService productService;
//get All products
   @GetMapping(path = RequestEndPoints.GET_ALL_PRODUCTS)
public ResponseDTO getAllProducts(){
        ResponseDTO <ProductDTO> responseDTO = productService.getAllProducts();
        System.out.print(responseDTO);
        return responseDTO;
}

//get product by products id
    @GetMapping("{id}")
    public ResponseEntity<Product> getProductByID(@PathVariable  long id){

        Product p = productRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("No product found with id"+id));

        return ResponseEntity.ok(p);
    }
//get all product belonging to a category when the catgory name is given

public ResponseDTO<Product> getProductsofCategory(@PathVariable String categoryName){

    ResponseDTO <ProductDTO> responseDTO = productService.getProductsByCategory(categoryName);

       return null;
}
    //get all  when its name containes a certain  string



}
