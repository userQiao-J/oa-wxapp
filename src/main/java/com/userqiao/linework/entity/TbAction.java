package com.userqiao.linework.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;

import java.io.Serializable;

/**
 * 行为表(TbAction)实体类
 *
 * @author makejava
 * @since 2021-02-17 00:21:49
 */
@ApiModel("行为类")
public class TbAction implements Serializable {
    private static final long serialVersionUID = 814871593093732563L;
    /**
     * 主键
     */
    @ApiParam("主键")
    private Object id;
    /**
     * 行为编号
     */
    @ApiParam("行为编号")
    private String actionCode;
    /**
     * 行为名称
     */
    @ApiParam("行为名称")
    private String actionName;


    public Object getId() {
        return id;
    }

    public void setId(Object id) {
        this.id = id;
    }

    public String getActionCode() {
        return actionCode;
    }

    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName;
    }

}