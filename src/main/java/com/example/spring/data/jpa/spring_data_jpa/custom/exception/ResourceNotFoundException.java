package com.example.spring.data.jpa.spring_data_jpa.custom.exception;

public class ResourceNotFoundException extends Exception{

    public ResourceNotFoundException(String message){
        super(message);
    }
}
