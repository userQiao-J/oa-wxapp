package com.userqiao.linework.controller;

import com.userqiao.linework.entity.TbRole;
import com.userqiao.linework.service.TbRoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 角色表(TbRole)表控制层
 *
 * @author makejava
 * @since 2021-02-17 00:22:01
 */
@RestController
@RequestMapping("tbRole")
public class TbRoleController {
    /**
     * 服务对象
     */
    @Resource
    private TbRoleService tbRoleService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbRole selectOne(Integer id) {
        return this.tbRoleService.queryById(id);
    }

}