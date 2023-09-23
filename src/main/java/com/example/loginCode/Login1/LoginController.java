package com.example.loginCode.Login1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("login")
public class LoginController {
    @Autowired
    private  LoginService loginService;

    @GetMapping("log")
    public List<Login> getAllDetails() {
        return loginService.getAllDetails();

    }

    @PostMapping("add")
    public Login addDetails(@RequestBody Login login) {
        return loginService.addDetails(login);
    }


    @PutMapping("update")
    public Login UpdateDetails(@RequestBody Login login)
    {
        return  loginService.updateDetails(login) ;
    }
@PostMapping ("authenticate")
    public ResponseEntity<MobileAndUser>loginDetails(@RequestBody Login login)
{
   return loginService. loginDetails(login);
}

}


