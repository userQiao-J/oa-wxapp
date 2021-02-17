package com.userqiao.linework.controller;

import com.userqiao.linework.entity.TbDept;
import com.userqiao.linework.service.TbDeptService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (TbDept)表控制层
 *
 * @author makejava
 * @since 2021-02-17 00:21:55
 */
@RestController
@RequestMapping("tbDept")
public class TbDeptController {
    /**
     * 服务对象
     */
    @Resource
    private TbDeptService tbDeptService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbDept selectOne(Integer id) {
        return this.tbDeptService.queryById(id);
    }

}