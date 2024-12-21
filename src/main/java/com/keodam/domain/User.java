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
    private String OAuthId;
    private String imageUrl;
    private Role authority;
    private SocialType socialType;

    @Builder
    public User(String username, String nickname, String password, String OAuthId, String email, String imageUrl, SocialType socialType, Role authority) {
        this.username = username;
        this.nickname = nickname;
        this.password = password;
        this.OAuthId = OAuthId;
        this.email = email;
        this.imageUrl = imageUrl;
        this.socialType = socialType;
        this.authority = authority;
    }


}