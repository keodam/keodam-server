package com.keodam.auth.domain.userinfo;

import com.keodam.domain.User;
import java.util.Map;

public class GoogleUserInfo extends UserInfo {

    public GoogleUserInfo(Map<String, Object> attributes) { super(attributes); }

    @Override
    public String getId(){ return (String) attributes.get("sub"); }

    @Override
    public String getNickname(){ return (String) attributes.get("name"); }

    @Override
    public String getImageUrl(){ return (String) attributes.get("picture"); }

    @Override
    public String getEmail(){ return (String) attributes.get("email"); }
}
