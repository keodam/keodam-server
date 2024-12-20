package com.keodam.domain;

import jakarta.persistence.Entity;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
public class User{
    private String username;
    private String nickname;
    private String password;
    private String email;
    private Role authority;
    private SocialType socialType;

    @Builder
    public User(String username, String nickname, String password, String email, SocialType socialType, Role authority) {
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.email = email;
        this.socialType = socialType;
        this.authority = authority;
    }


}