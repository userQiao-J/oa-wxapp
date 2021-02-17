package com.userqiao.linework.controller;

import com.userqiao.linework.entity.TbCheckin;
import com.userqiao.linework.service.TbCheckinService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 签到表(TbCheckin)表控制层
 *
 * @author makejava
 * @since 2021-02-17 00:21:52
 */
@RestController
@RequestMapping("tbCheckin")
public class TbCheckinController {
    /**
     * 服务对象
     */
    @Resource
    private TbCheckinService tbCheckinService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbCheckin selectOne(Integer id) {
        return this.tbCheckinService.queryById(id);
    }

}