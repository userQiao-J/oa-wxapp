package com.userqiao.linework.common.utils;

import org.apache.http.HttpStatus;

import java.util.HashMap;
import java.util.Map;

/**
 * 接口返回公共类
 *
 * @author ：userqiao
 * @email：userqiao@163.com
 * @date ：2021/2/16 22:56
 */
public class BaseResult extends HashMap<String, Object> {

    public BaseResult(){
        put("code", HttpStatus.SC_OK);
        put("msg","SUCCESS");
    }

    public static BaseResult error() {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, "未知异常，请联系管理员");
    }
    public static BaseResult error(String msg) {
        return error(HttpStatus.SC_INTERNAL_SERVER_ERROR, msg);
    }
    public static BaseResult error(int code, String msg) {
        BaseResult r = new BaseResult();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }
    public static BaseResult ok(String msg) {
        BaseResult r = new BaseResult();
        r.put("msg", msg);
        return r;
    }
    public static BaseResult ok(Map<String, Object> map) {
        BaseResult r = new BaseResult();
        r.putAll(map);
        return r;
    }
    public static BaseResult ok() {
        return new BaseResult();
    }
    @Override
    public BaseResult put(String key, Object value) {
        super.put(key, value);
        return this;
    }
}
