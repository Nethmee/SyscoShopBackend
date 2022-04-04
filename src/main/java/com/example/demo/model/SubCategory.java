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
@Table(name="SubCategory")


public class SubCategory {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long subCatId;

    @Column(name="subCategoryName" , nullable=false)
    private String subCategoryName;

    @ManyToOne
    @JoinColumn(name="catId")
    private Category catID;
}
