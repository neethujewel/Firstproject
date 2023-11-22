package com.AppFood.Project.Utils;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Date;

public class CaffeUtils {
    //public static Object getResponseEntity;

    private CaffeUtils(){

    }
    public static ResponseEntity<String>getResponseEntity(String responseMessage, HttpStatus httpStatus){
        return new ResponseEntity<String>("{\"message\":\"" + responseMessage + "\"}", httpStatus);

    }

//    public static String getUUID(){
//
//        Date date = new Date();
//        long time = date.getTime();
//        return "BILL-"+time;
//
//    }
}
