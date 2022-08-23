package com.example.tourism.api.dto;

import com.example.tourism.data.entities.UserEntity;

public class UserDTO {
    private Integer user_id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String wallet;
    private String notifications;

    public UserDTO(Integer user_id, String name, String surname, String email, String password, String wallet, String notifications) {
        this.user_id = user_id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.password = password;
        this.wallet = wallet;
        this.notifications = notifications;
    }
    public UserDTO(UserEntity userEntity){
        this.user_id = userEntity.getUserId();
        this.name = userEntity.getName();
        this.surname = userEntity.getSurname();
        this.email = userEntity.getEmail();
        this.password = userEntity.getPassword();
        this.wallet = userEntity.getWallet();
        this.notifications = userEntity.getNotifications();
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWallet() {
        return wallet;
    }

    public void setWallet(String wallet) {
        this.wallet = wallet;
    }

    public String getNotifications() {
        return notifications;
    }

    public void setNotifications(String notifications) {
        this.notifications = notifications;
    }
}
