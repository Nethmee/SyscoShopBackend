package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO <T> implements Serializable {

    private String message;
    private String successOrFail;
    private T data;//check if this can hold a list

}




