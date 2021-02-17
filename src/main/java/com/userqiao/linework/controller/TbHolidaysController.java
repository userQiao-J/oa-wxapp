package com.userqiao.linework.controller;

import com.userqiao.linework.entity.TbHolidays;
import com.userqiao.linework.service.TbHolidaysService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 节假日表(TbHolidays)表控制层
 *
 * @author makejava
 * @since 2021-02-17 00:21:57
 */
@RestController
@RequestMapping("tbHolidays")
public class TbHolidaysController {
    /**
     * 服务对象
     */
    @Resource
    private TbHolidaysService tbHolidaysService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbHolidays selectOne(Integer id) {
        return this.tbHolidaysService.queryById(id);
    }

}