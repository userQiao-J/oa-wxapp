package com.userqiao.linework.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户表(TbUser)实体类
 *
 * @author makejava
 * @since 2021-02-17 00:22:02
 */
@ApiModel("用户表")
@Getter
@Setter
public class TbUser implements Serializable {
    private static final long serialVersionUID = 665929581770488062L;
    /**
     * 主键
     */
    @ApiParam("主键")
    private Integer id;
    /**
     * 长期授权字符串
     */
    @ApiParam("长期授权字符串")
    private String openId;
    /**
     * 昵称
     */
    @ApiParam("昵称")
    private String nickname;
    /**
     * 头像网址
     */
    @ApiParam("头像网址")
    private String photo;
    /**
     * 姓名
     */
    @ApiParam("姓名")
    private String name;
    /**
     * 性别
     */
    @ApiParam("性别")
    private int sex;
    /**
     * 手机号码
     */
    @ApiParam("手机号码")
    private String tel;
    /**
     * 邮箱
     */
    @ApiParam("邮箱")
    private String email;
    /**
     * 入职日期
     */
    @ApiParam("入职日期")
    private Date hiredate;
    /**
     * 角色
     */
    @ApiParam("角色")
    private Object role;
    /**
     * 是否是超级管理员
     */
    @ApiParam("是否是超级管理员")
    private Boolean root;
    /**
     * 部门编号
     */
    @ApiParam("部门编号")
    private Integer deptId;
    /**
     * 状态
     */
    @ApiParam("状态")
    private Byte status;
    /**
     * 创建时间
     */
    @ApiParam("主键")
    private Date createTime;



}