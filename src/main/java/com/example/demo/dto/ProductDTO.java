package com.example.demo.dto;

import com.example.demo.model.Product;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    private Long id;
    private String productName;
    private String description;
    private String supplier;
    private float  rating;
    private int quantity;
    private float unitPrice;
    private String url;
    private List<Product> listofProducts;

}
