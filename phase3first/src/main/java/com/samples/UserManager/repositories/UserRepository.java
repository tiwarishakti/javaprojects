package com.samples.UserManager.repositories;

import org.springframework.data.repository.CrudRepository;

import com.samples.UserManager.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    public User findByName(String name);
}