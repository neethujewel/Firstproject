package com.example.loginCode.Login1;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.mapping.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LoginDao extends JpaRepository<Login,Integer>
{
    Optional<Login> findByEmail(String email);
}



