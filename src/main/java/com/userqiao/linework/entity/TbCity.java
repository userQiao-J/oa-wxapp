package com.userqiao.linework.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;

import java.io.Serializable;

/**
 * 疫情城市列表(TbCity)实体类
 *
 * @author makejava
 * @since 2021-02-17 00:21:53
 */
@ApiModel
public class TbCity implements Serializable {
    private static final long serialVersionUID = -18130940643693058L;
    /**
     * 主键
     */
    @ApiParam("主键")
    private Integer id;
    /**
     * 城市名称
     */
    @ApiParam("城市名称")
    private String city;
    /**
     * 拼音简称
     */
    @ApiParam("拼音简称")
    private String code;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

}