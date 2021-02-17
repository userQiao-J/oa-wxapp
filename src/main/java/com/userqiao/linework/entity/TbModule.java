package com.userqiao.linework.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;

import java.io.Serializable;

/**
 * 模块资源表(TbModule)实体类
 *
 * @author makejava
 * @since 2021-02-17 00:21:59
 */
@ApiModel("模块资源表")
public class TbModule implements Serializable {
    private static final long serialVersionUID = -57114244931219623L;
    /**
     * 主键
     */
    @ApiParam("id")
    private Integer id;
    /**
     * 模块编号
     */
    @ApiParam("模块编号")
    private String moduleCode;
    /**
     * 模块名称
     */
    @ApiParam("模块名称")
    private String moduleName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModuleCode() {
        return moduleCode;
    }

    public void setModuleCode(String moduleCode) {
        this.moduleCode = moduleCode;
    }

    public String getModuleName() {
        return moduleName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }

}