package com.userqiao.linework.controller;

import com.userqiao.linework.entity.TbWorkday;
import com.userqiao.linework.service.TbWorkdayService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (TbWorkday)表控制层
 *
 * @author makejava
 * @since 2021-02-17 00:22:03
 */
@RestController
@RequestMapping("tbWorkday")
public class TbWorkdayController {
    /**
     * 服务对象
     */
    @Resource
    private TbWorkdayService tbWorkdayService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbWorkday selectOne(Integer id) {
        return this.tbWorkdayService.queryById(id);
    }

}