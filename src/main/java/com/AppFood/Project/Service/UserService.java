package com.AppFood.Project.Service;

import org.springframework.http.ResponseEntity;

import java.util.Map;

public interface UserService
{
    ResponseEntity<String>signUp(Map<String,String>requestMap);

//    ResponseEntity<String> signup(Map<String, String> requestMap);
}
