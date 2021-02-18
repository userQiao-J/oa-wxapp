package com.userqiao.linework.config.shiro;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * Token封装的认证对象
 * @author：userqiao
 * @email：userqiao@163.com
 * @date：2021/2/18 15:05
 */
public class OAuth2Token implements AuthenticationToken {

    private String token;

    public OAuth2Token(String token){
        this.token = token;
    }
    @Override
    public String getPrincipal() {
        return token;
    }

    @Override
    public String getCredentials() {
        return token;
    }
}
