package com.userqiao.linework.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * 角色表(TbRole)实体类
 *
 * @author makejava
 * @since 2021-02-17 00:22:01
 */
@ApiModel("角色表")
@Getter
@Setter
public class TbRole implements Serializable {
    private static final long serialVersionUID = 511777649543849098L;
    /**
     * 主键
     */
    @ApiParam("主键")
    private Integer id;
    /**
     * 角色名称
     */
    @ApiParam("角色名称")
    private String roleName;
    /**
     * 权限集合
     */
    @ApiParam("主键")
    private String permissions;

}