package com.userqiao.linework.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;

import java.io.Serializable;
import java.util.Date;

/**
 * 节假日表(TbHolidays)实体类
 *
 * @author makejava
 * @since 2021-02-17 00:21:57
 */
@ApiModel("节假日")
public class TbHolidays implements Serializable {
    private static final long serialVersionUID = -20327395936834442L;
    /**
     * 主键
     */
    @ApiParam("主键")
    private Integer id;
    /**
     * 日期
     */
    @ApiParam("日期")
    private Date date;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}