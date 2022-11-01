package com.example.authentication.repository;

import com.example.authentication.entity.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

    @Query(value = "SELECT * FROM users WHERE username = ?1", nativeQuery = true)
    List<User> findByUserName(String userName);
}
