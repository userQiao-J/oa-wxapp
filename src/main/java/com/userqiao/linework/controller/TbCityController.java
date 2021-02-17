package com.userqiao.linework.controller;

import com.userqiao.linework.entity.TbCity;
import com.userqiao.linework.service.TbCityService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 疫情城市列表(TbCity)表控制层
 *
 * @author makejava
 * @since 2021-02-17 00:21:54
 */
@RestController
@RequestMapping("tbCity")
public class TbCityController {
    /**
     * 服务对象
     */
    @Resource
    private TbCityService tbCityService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbCity selectOne(Integer id) {
        return this.tbCityService.queryById(id);
    }

}