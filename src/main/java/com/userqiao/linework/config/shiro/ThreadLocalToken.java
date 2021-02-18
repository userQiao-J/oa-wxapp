package com.userqiao.linework.config.shiro;

import org.springframework.stereotype.Component;

/**
 * @author：userqiao
 * @email：userqiao@163.com
 * @date：2021/2/18 16:48
 */
@Component
public class ThreadLocalToken {

    private ThreadLocal<String> local = new ThreadLocal<>();

    public void setToken(String token){
        local.set(token);
    }

    public String getToken(){
        return local.get();
    }

    public void clear(){
        local.remove();
    }
}
