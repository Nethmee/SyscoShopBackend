package com.example.demo.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Products")

public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    @Column(name="productName" , nullable=false)
    private String productName;
    @Column(name ="description")
    private String description;
    @Column(name="supplier")
    private String supplier;
    @Column(name="ratings")
    private float  rating;
    @Column(name="quantity")
    private int quantity;
    @Column(name="unitPrice")
    private float unitPrice;
    @Column(name="url")
    private String url;

    @ManyToOne
    @JoinColumn(name="catId")
    private Category catID;
}
