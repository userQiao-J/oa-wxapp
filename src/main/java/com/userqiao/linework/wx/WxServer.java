package com.userqiao.linework.wx;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * 请求Wx相关API的服务类
 * @author：userqiao
 * @email：userqiao@163.com
 * @date：2021/2/19 15:54
 */
@Component
public class WxServer {

    @Value("${line-work.wx.appId}")
    private String appId;
    @Value("${line-work.wx.secret}")
    private String secret;

    private final String URL = "https://api.weixin.qq.com/sns/jscode2session";

    /**
     * 获取用户的openId
     * @param code
     * @return
     */
    public String getOpenIdByUser(String code){
        Map map = new HashMap();
        map.put("appid", appId);
        map.put("secret", secret);
        map.put("js_code", code);
        map.put("grant_type", "authorization_code");
        String response = HttpUtil.post(URL, map);
        JSONObject json = JSONUtil.parseObj(response);
        return json.getStr("openid");
    }
}
