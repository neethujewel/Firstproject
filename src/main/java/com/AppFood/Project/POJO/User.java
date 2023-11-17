package com.AppFood.Project.POJO;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.boot.autoconfigure.web.WebProperties;
import java.io.Serializable;
@NamedQuery(name="User.findByEmailId",query = "select u from User u where u.email=:email")
@Entity
@DynamicUpdate
@DynamicInsert
@Table(name = "user")
public class User implements Serializable
{
    private static final long seialVersionUID=1l;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "ContactNumber")
    private String ContactNumber;

    @Column(name = "email")
    private String email;

    @Column(name = "Password")
    private String Password;

    @Column(name = "Status")
    private String Status;

    @Column(name = "role")
    private String role;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return ContactNumber;
    }

    public void setContactNumber(String contactNumber) {
        ContactNumber = contactNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public User(Integer id, String name, String contactNumber, String email, String password, String status, String role) {
        this.id = id;
        this.name = name;
        ContactNumber = contactNumber;
        this.email = email;
        Password = password;
        Status = status;
        this.role = role;

    }
}
