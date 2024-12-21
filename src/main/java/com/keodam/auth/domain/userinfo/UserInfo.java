package com.keodam.auth.domain.userinfo;

import java.util.Map;

public abstract class UserInfo {

    Map<String, Object> attributes;

    public UserInfo(Map<String, Object> attributes){ this.attributes = attributes; }

    public abstract String getId();
    public abstract String getNickname();
    public abstract String getImageUrl();
    public abstract String getEmail();
}
