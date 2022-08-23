package com.example.tourism.business.services;

import com.example.tourism.data.entities.UserEntity;


public interface UserService extends CrudService<UserEntity, Integer> {

    UserEntity createUser(int user_id, String name, String surname, String email, String password, String wallet);
}
