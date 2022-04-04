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
@Table(name="Cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long cartID;

    @Column(name="cartName" , nullable=true)
    private String cartName;


    //this should be not null every cart must have a user ID
    @ManyToOne
    @JoinColumn(name="cart_user_Id")
    private User userID;

}
