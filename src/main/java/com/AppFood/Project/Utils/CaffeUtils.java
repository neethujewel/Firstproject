package com.AppFood.Project.Utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class CaffeUtils {
    public static Object getResponseEntity;

    private CaffeUtils(){

    }
    public static ResponseEntity<String>getResponseEntity(String responseMessage, HttpStatus httpStatus){
        return new ResponseEntity<String>("{\"message\":\""+responseMessage+"\"}", httpStatus);

    }
}
