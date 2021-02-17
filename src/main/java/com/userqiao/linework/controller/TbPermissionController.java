package com.userqiao.linework.controller;

import com.userqiao.linework.entity.TbPermission;
import com.userqiao.linework.service.TbPermissionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (TbPermission)表控制层
 *
 * @author makejava
 * @since 2021-02-17 00:22:00
 */
@RestController
@RequestMapping("tbPermission")
public class TbPermissionController {
    /**
     * 服务对象
     */
    @Resource
    private TbPermissionService tbPermissionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbPermission selectOne(Integer id) {
        return this.tbPermissionService.queryById(id);
    }

}