package com.userqiao.linework.controller;

import com.userqiao.linework.entity.TbFaceModel;
import com.userqiao.linework.service.TbFaceModelService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (TbFaceModel)表控制层
 *
 * @author makejava
 * @since 2021-02-17 00:21:56
 */
@RestController
@RequestMapping("tbFaceModel")
public class TbFaceModelController {
    /**
     * 服务对象
     */
    @Resource
    private TbFaceModelService tbFaceModelService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbFaceModel selectOne(Integer id) {
        return this.tbFaceModelService.queryById(id);
    }

}