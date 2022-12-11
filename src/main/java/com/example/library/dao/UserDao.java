package com.example.library.dao;

import com.example.library.model.UserModel;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends CrudRepository<UserModel,Integer> {

    @Query(value = "SELECT `id`, `email`, `password`, `address`, `name`, `phone` FROM `users` WHERE `email`= :email",nativeQuery = true)
    List<UserModel> UserLogin(@Param("email") String email);


}
