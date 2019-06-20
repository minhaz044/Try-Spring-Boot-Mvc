package com.Dao;

import org.springframework.data.repository.CrudRepository;

import com.Model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
