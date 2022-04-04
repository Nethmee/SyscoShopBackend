package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Category")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long catId;

    @Column(name="categoryName" , nullable=false)
    private String categoryName;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catID",fetch = FetchType.LAZY)
    private List<SubCategory> subCategories;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "catID",fetch = FetchType.LAZY)
    private List<Product> products;

}
