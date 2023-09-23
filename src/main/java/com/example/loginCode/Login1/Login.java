package com.example.loginCode.Login1;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name ="login_Pages" )
public class Login {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "Email_ID")
    private String email;
    @Column(name = "Mobile_Number")
    private  long mobileNumber;
    @Column(name ="Password" )
    private String password;
}
