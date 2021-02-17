package com.userqiao.linework.controller;

import com.userqiao.linework.entity.TbModule;
import com.userqiao.linework.service.TbModuleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 模块资源表(TbModule)表控制层
 *
 * @author makejava
 * @since 2021-02-17 00:21:59
 */
@RestController
@RequestMapping("tbModule")
public class TbModuleController {
    /**
     * 服务对象
     */
    @Resource
    private TbModuleService tbModuleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbModule selectOne(Integer id) {
        return this.tbModuleService.queryById(id);
    }

}