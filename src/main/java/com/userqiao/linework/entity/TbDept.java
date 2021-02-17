package com.userqiao.linework.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;

import java.io.Serializable;

/**
 * (TbDept)实体类
 *
 * @author makejava
 * @since 2021-02-17 00:21:55
 */
@ApiModel("(TbDept)实体类")
public class TbDept implements Serializable {
    private static final long serialVersionUID = 555850059423519054L;
    /**
     * 主键
     */
    @ApiParam("主键")
    private Integer id;
    /**
     * 部门名称
     */
    @ApiParam("部门名称")
    private String deptName;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

}