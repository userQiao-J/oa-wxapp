package com.userqiao.linework;

import com.userqiao.linework.common.utils.BaseResult;
import com.userqiao.linework.config.shiro.ThreadLocalToken;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 拦截所有Controller的返回值 在BaseResult中添加更新后的令牌信息
 * @author userqiao
 */
@Aspect
@Component
public class TokenAop {

    @Autowired
    private ThreadLocalToken threadLocalToken;
    @Pointcut("execution(public * com.userqiao.linework.controller.*.*(..)))")
    public void aspect() {
    }


    @Around("aspect()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        //方法执行结果
        BaseResult r = (BaseResult) point.proceed();
        String token = threadLocalToken.getToken();
        //如果ThreadLocal中存在Token，说明是更新的Token
        if (token != null) {
            //往响应中放置Token
            r.put("token", token);
            threadLocalToken.clear();
        }
        return r;
    }
}
