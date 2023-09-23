package com.example.loginCode.Login1;

import org.apache.catalina.User;
import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.Optional;

@Service
public class LoginService {
    @Autowired
    LoginDao loginDao;

    public List<Login> getAllDetails() {
        return loginDao.findAll();
    }

    public Login addDetails(Login login)
    {
        return loginDao.save(login);

    }


    public Login updateDetails(Login login)
    {
        Login updateLogin = loginDao.findById(login.getId()).orElse(null);

        if (updateLogin != null) {
            updateLogin.setId(login.getId());
            updateLogin.setName(login.getName());
            updateLogin.setEmail(login.getEmail());
            updateLogin.setMobileNumber(login.getMobileNumber());
            updateLogin.setPassword(login.getPassword());
            loginDao.save(updateLogin);
            return login;
        }
        return null;
    }




    public ResponseEntity<MobileAndUser> loginDetails(Login login) throws UserNotFoundException
    {
        Optional<Login>Details= loginDao .findByEmail(login.getEmail());

        if (Details.isPresent())
        {
            Login dbDetails = Details.get();
            MobileAndUser response = new MobileAndUser();
            if (login.getPassword().equals(dbDetails.getPassword()))
            {
                response.setUsername(dbDetails.getName());
            response.setMobileNumber(dbDetails.getMobileNumber());
            return ResponseEntity.ok().body(response);
            }
            else
            {
                    throw  new UserNotFoundException("Incorrect password");
            }


        }
       throw new UserNotFoundException("no user found");
    }


}

