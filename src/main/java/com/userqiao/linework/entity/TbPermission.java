package com.userqiao.linework.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;

import java.io.Serializable;

/**
 * (TbPermission)实体类
 *
 * @author makejava
 * @since 2021-02-17 00:22:00
 */
@ApiModel("(TbPermission)实体类")
public class TbPermission implements Serializable {
    private static final long serialVersionUID = -37561433411293722L;
    /**
     * 主键
     */
    @ApiParam("主键")
    private Integer id;
    /**
     * 权限
     */
    @ApiParam("权限")
    private String permissionName;
    /**
     * 模块ID
     */
    @ApiParam("模块ID")
    private Integer moduleId;
    /**
     * 行为ID
     */
    @ApiParam("行为ID")
    private Integer actionId;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public Integer getModuleId() {
        return moduleId;
    }

    public void setModuleId(Integer moduleId) {
        this.moduleId = moduleId;
    }

    public Integer getActionId() {
        return actionId;
    }

    public void setActionId(Integer actionId) {
        this.actionId = actionId;
    }

}