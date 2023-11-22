package com.AppFood.Project.Dao;

import com.AppFood.Project.POJO.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

public interface UserDao extends JpaRepository<User,Integer>
{
User findByEmailId(@Param("emailId")String email);
}
