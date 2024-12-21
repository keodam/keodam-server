package com.keodam.auth.dto;

import com.keodam.auth.domain.userinfo.GoogleUserInfo;
import com.keodam.auth.domain.userinfo.KakaoUserInfo;
import com.keodam.auth.domain.userinfo.UserInfo;
import com.keodam.domain.Role;
import com.keodam.domain.SocialType;
import com.keodam.domain.User;

import java.util.Map;

public class UserInfoDTO {

    private String nameAttributeKey;
    private UserInfo userInfo;
    private SocialType socialType;

    public UserInfoDTO(SocialType socialType, String nameAttributeKey, Map<String, Object> attributes) {
        this.nameAttributeKey = nameAttributeKey;
        this.socialType = socialType;

        if(socialType == SocialType.GOOGLE) this.userInfo = new GoogleUserInfo(attributes);
        if(socialType == SocialType.KAKAO) this.userInfo = new KakaoUserInfo(attributes);
        if(socialType == SocialType.APPLE) this.userInfo = new AppleUserInfo(attributes);
    }

    public User toEntity() {
        return User.builder()
                .socialType(socialType)
                .OAuthId(userInfo.getId())
                .nickname(userInfo.getNickname())
                .imageUrl(userInfo.getImageUrl())
                .email(userInfo.getEmail())
                .authority(Role.GUEST)
                .build();
    }
}
