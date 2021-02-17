package com.userqiao.linework.controller;

import com.userqiao.linework.entity.SysConfig;
import com.userqiao.linework.service.SysConfigService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (SysConfig)表控制层
 *
 * @author makejava
 * @since 2021-02-17 10:26:48
 */
@RestController
@RequestMapping("sysConfig")
public class SysConfigController {
    /**
     * 服务对象
     */
    @Resource
    private SysConfigService sysConfigService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public SysConfig selectOne(Integer id) {
        return this.sysConfigService.queryById(id);
    }

}