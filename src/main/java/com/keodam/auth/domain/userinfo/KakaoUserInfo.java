package com.keodam.auth.domain.userinfo;

import java.util.Map;

public class KakaoUserInfo extends UserInfo{

    public KakaoUserInfo(Map<String, Object> attributes) { super(attributes); }

    @Override
    public String getId(){ return String.valueOf(attributes.get("id")); }

    @Override
    public String getNickname(){ return (String) attributes.get("name"); }

    @Override
    public String getImageUrl(){ return (String) attributes.get("picture"); }

    @Override
    public String getEmail(){ return (String) attributes.get("email"); }
}
