package com.userqiao.linework.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;

import java.io.Serializable;

/**
 * (TbFaceModel)实体类
 *
 * @author makejava
 * @since 2021-02-17 00:21:56
 */
@ApiModel("人脸识别")
public class TbFaceModel implements Serializable {
    private static final long serialVersionUID = 534068251107950589L;
    /**
     * 主键值
     */
    @ApiParam("主键")
    private Integer id;
    /**
     * 用户ID
     */
    @ApiParam("用户ID")
    private Integer userId;
    /**
     * 用户人脸模型
     */
    @ApiParam("用户人脸模型")
    private String faceModel;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFaceModel() {
        return faceModel;
    }

    public void setFaceModel(String faceModel) {
        this.faceModel = faceModel;
    }

}