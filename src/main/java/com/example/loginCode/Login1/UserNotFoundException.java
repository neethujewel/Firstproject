package com.example.loginCode.Login1;

public class UserNotFoundException extends RuntimeException
{
    public UserNotFoundException(String message){
        super(message);
    }
}
