package com.userqiao.linework.controller;

import com.userqiao.linework.entity.TbAction;
import com.userqiao.linework.service.TbActionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 行为表(TbAction)表控制层
 *
 * @author makejava
 * @since 2021-02-17 00:21:51
 */
@RestController
@RequestMapping("tbAction")
public class TbActionController {
    /**
     * 服务对象
     */
    @Resource
    private TbActionService tbActionService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbAction selectOne(Object id) {
        return this.tbActionService.queryById(id);
    }

}