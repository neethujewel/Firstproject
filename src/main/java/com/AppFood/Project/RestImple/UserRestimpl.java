package com.AppFood.Project.RestImple;

import com.AppFood.Project.Constant.Utils.CffeConstant;
import com.AppFood.Project.Rest.UserRest;
import com.AppFood.Project.Service.UserService;
import com.AppFood.Project.Utils.CaffeUtils;
import org.hibernate.engine.spi.Status;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class UserRestimpl implements UserRest{
@Autowired
    UserService userService;
    @Override
    public ResponseEntity<String> signUp(Map<String, String> requestMap) {
        try{
return userService.signup(requestMap);
        }catch (Exception ex){
            ex.printStackTrace();
        }
        return CaffeUtils.getResponseEntity<String>(CffeConstant.SOMETHING_WENT_WRONG, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
