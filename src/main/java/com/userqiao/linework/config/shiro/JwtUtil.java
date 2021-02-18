package com.userqiao.linework.config.shiro;

import cn.hutool.core.date.DateField;
import cn.hutool.core.date.DateUtil;
import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTCreator;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.userqiao.linework.exception.LineWorkException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * JWT工具类
 * @author：userqiao
 * @email：userqiao@163.com
 * @date：2021/2/18 14:21
 */
@Component
@Slf4j
public class JwtUtil {

    /**
     * 密钥
     */
    @Value("${line-work.jwt.secret}")
    private String secret;

    /**
     * 过期时间（天）
     */
    @Value("${line-work.jwt.expire}")
    private int expire;

    /**
     * 生成token
     * @param userId 用户ID
     * @return
     */
    public String createToken(int userId){
        // 设置过期时间为五天后，DateUtil.offset主要是时间便宜
        Date date = DateUtil.offset(new Date(), DateField.DAY_OF_YEAR, expire).toJdkDate();
        Algorithm algorithm = Algorithm.HMAC256(secret);
        JWTCreator.Builder builder = JWT.create();
        String token = builder.withClaim("userId", userId).withExpiresAt(date).sign(algorithm);
        return token;
    }

    /**
     * 根据Token获取到用户ID
     * @param token
     * @return
     */
    public int getUserId(String token) {
        try {
            DecodedJWT jwt = JWT.decode(token);
            return jwt.getClaim("userId").asInt();
        } catch (Exception e) {
            throw new LineWorkException("令牌无效");
        }
    }

    /**
     * 校验Token
     * @param token
     */
    public void verifierToken(String token) {
        //创建加密算法对象
        Algorithm algorithm = Algorithm.HMAC256(secret);
        JWTVerifier verifier = JWT.require(algorithm).build();
        verifier.verify(token);
    }

}
