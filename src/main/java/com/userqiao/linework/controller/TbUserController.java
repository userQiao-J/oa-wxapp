package com.userqiao.linework.controller;

import com.userqiao.linework.entity.TbUser;
import com.userqiao.linework.service.TbUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

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

}