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
@Table(name="User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long userId;

    @Column(name="userName" , nullable=false)
    private String userName;

    @Column(name="password" , nullable=false)
    private String password;

// one user can have multiple carts and one cart has only one user
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userID",fetch = FetchType.LAZY)
    private List<Cart> carts;


}
