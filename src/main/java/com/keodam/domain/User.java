package com.keodam.domain;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
public class User{
    private String username;
    private String password;
    private String email;
    private LoginMethod loginMethod;

    @Builder
    public User(String username, String password, String email, LoginMethod loginMethod) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.loginMethod = loginMethod;
    }
}