package com.example.demo.controller;

import com.example.demo.model.Category;
import com.example.demo.model.Product;
import com.example.demo.repository.CategoryRepository;
import com.example.demo.repository.ProductRepository;
import com.example.demo.util.RequestEndPoints;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController

@RequestMapping("/api/v1/CategoryController")
public class CategoryController {

    @Autowired
    private CategoryRepository categoryRepository;

    @GetMapping(path= RequestEndPoints.GET_ALL_CATEGORIES)
    public List<Category> getAllCategories(){

        return categoryRepository.findAll();
    }



}
