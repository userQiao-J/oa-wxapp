package com.userqiao.linework.entity;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;

import java.io.Serializable;
import java.util.Date;

/**
 * 签到表(TbCheckin)实体类
 *
 * @author makejava
 * @since 2021-02-17 00:21:52
 */
@ApiModel("签到表")
public class TbCheckin implements Serializable {
    private static final long serialVersionUID = 718901179737030246L;
    /**
     * 主键
     */
    @ApiParam("主键")
    private Integer id;
    /**
     * 用户ID
     */
    @ApiParam("用户编号")
    private Integer userId;
    /**
     * 签到地址
     */
    @ApiParam("签到地址")
    private String address;
    /**
     * 国家
     */
    @ApiParam("国家")
    private String country;
    /**
     * 省份
     */
    @ApiParam("省份")
    private String province;
    /**
     * 城市
     */
    @ApiParam("城市")
    private String city;
    /**
     * 区划
     */
    @ApiParam("区划")
    private String district;
    /**
     * 考勤结果
     */
    @ApiParam("考勤结果")
    private Object status;
    /**
     * 风险等级
     */
    @ApiParam("风险等级")
    private Object risk;
    /**
     * 签到日期
     */
    @ApiParam("签到日期")
    private Object date;
    /**
     * 签到时间
     */
    @ApiParam("签到时间")
    private Date createTime;


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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public Object getStatus() {
        return status;
    }

    public void setStatus(Object status) {
        this.status = status;
    }

    public Object getRisk() {
        return risk;
    }

    public void setRisk(Object risk) {
        this.risk = risk;
    }

    public Object getDate() {
        return date;
    }

    public void setDate(Object date) {
        this.date = date;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}