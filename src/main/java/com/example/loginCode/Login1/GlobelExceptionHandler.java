package com.example.loginCode.Login1;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.nio.file.attribute.UserPrincipalNotFoundException;

@RestControllerAdvice

public class GlobelExceptionHandler
{
    @ExceptionHandler(UserNotFoundException.class)
    public  String exceptionHandler(Login NotFoundException)
    {
      return  "LoginNotFoundException:";

    }

}
