package com.userqiao.linework.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * (TbWorkday)实体类
 *
 * @author makejava
 * @since 2021-02-17 00:22:03
 */
@ApiModel("(TbWorkday)实体类")
@Getter
@Setter
public class TbWorkday implements Serializable {
    private static final long serialVersionUID = 307630033585741237L;
    /**
     * 主键
     */
    @ApiParam("ID")
    private Integer id;
    /**
     * 日期
     */
    @ApiParam("日期")
    private Date date;


}