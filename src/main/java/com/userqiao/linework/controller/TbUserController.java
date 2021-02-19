package com.userqiao.linework.controller;

import com.userqiao.linework.common.utils.BaseResult;
import com.userqiao.linework.config.shiro.JwtUtil;
import com.userqiao.linework.entity.TbUser;
import com.userqiao.linework.entity.vo.LoginVo;
import com.userqiao.linework.entity.vo.RegiestVo;
import com.userqiao.linework.service.TbUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * 用户表(TbUser)表控制层
 *
 * @author makejava
 * @since 2021-02-17 00:22:02
 */
@RestController
@RequestMapping("tbUser")
@Api("用户相关接口")
public class TbUserController {
    /**
     * 服务对象
     */
    @Resource
    private TbUserService tbUserService;

    @Autowired
    private JwtUtil jwtUtil;
    @Autowired
    private RedisTemplate redisTemplate;

    @Value("${line-work.jwt.cache-expire}")
    private int cacheExpire;


    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @ApiOperation("通过用户ID获取到用户信息")
    @GetMapping("selectOne")
    public TbUser selectOne(Integer id) {
        return this.tbUserService.queryById(id);
    }

    @ApiOperation("测试xss攻击")
    @GetMapping("testXss")
    public String testXss(String username){
       return username;
    }

    /**
     * 往Redis中添加Token值
     * @param token
     * @param userId
     */
    private void saveCacheToken(String token, int userId) {
        redisTemplate.opsForValue().set(token, userId + "", cacheExpire, TimeUnit.DAYS);
    }

    /**
     * 用户注册
     * @param regiestVo
     * @return
     */
    @PostMapping("/register")
    @ApiOperation("注册用户")
    public BaseResult register(@Validated @RequestBody RegiestVo regiestVo){
        int id = tbUserService.registerUser(regiestVo.getRegisterCode(), regiestVo.getCode(), regiestVo.getNickName(), regiestVo.getPhoto());
        String token = jwtUtil.createToken(id);
        Set<String> permsSet = tbUserService.searchUserPermissions(id);
        saveCacheToken(token,id);
        return BaseResult.ok("用户注册成功").put("token",token).put("permission",permsSet);
    }


    @PostMapping("/login")
    @ApiOperation("登陆系统")
    public BaseResult login(@Validated @RequestBody LoginVo loginVo){
        int id = tbUserService.login(loginVo.getCode());
        String token = jwtUtil.createToken(id);
        Set<String> permsSet = tbUserService.searchUserPermissions(id);
        saveCacheToken(token, id);
        return BaseResult.ok("登陆成功").put("token", token).put("permission", permsSet);
    }
}
