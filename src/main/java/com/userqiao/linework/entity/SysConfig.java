package com.userqiao.linework.entity;

import java.io.Serializable;

/**
 * (SysConfig)实体类
 *
 * @author makejava
 * @since 2021-02-17 10:26:48
 */
public class SysConfig implements Serializable {
    private static final long serialVersionUID = -92081289438495979L;
    /**
     * 主键
     */
    private Integer id;
    /**
     * 参数名
     */
    private String paramKey;
    /**
     * 参数值
     */
    private String paramValue;
    /**
     * 状态
     */
    private Integer status;
    /**
     * 备注
     */
    private String remark;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParamKey() {
        return paramKey;
    }

    public void setParamKey(String paramKey) {
        this.paramKey = paramKey;
    }

    public String getParamValue() {
        return paramValue;
    }

    public void setParamValue(String paramValue) {
        this.paramValue = paramValue;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

}