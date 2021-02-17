package com.userqiao.linework.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

/**
 * 会议表(TbMeeting)实体类
 *
 * @author makejava
 * @since 2021-02-17 00:21:58
 */
@ApiModel("会议表")
@Getter
@Setter
public class TbMeeting implements Serializable {
    private static final long serialVersionUID = -91297047004834298L;
    /**
     * 主键
     */
    @ApiParam("主键")
    private Object id;
    /**
     * UUID
     */
    @ApiParam("UUID")
    private String uuid;
    /**
     * 会议题目
     */
    @ApiParam("会议题目")
    private String title;
    /**
     * 创建人ID
     */
    @ApiParam("创建人ID")
    private Long creatorId;
    /**
     * 日期
     */
    @ApiParam("日期")
    private Date date;
    /**
     * 开会地点
     */
    @ApiParam("开会地点")
    private String place;
    /**
     * 开始时间
     */
    @ApiParam("开始时间")
    private Date start;
    /**
     * 结束时间
     */
    @ApiParam("结束时间")
    private Date end;
    /**
     * 会议类型（1在线会议，2线下会议）
     */
    @ApiParam("会议类型（1在线会议，2线下会议）")
    private int type;
    /**
     * 参与者
     */
    @ApiParam("参与者")
    private String members;
    /**
     * 会议内容
     */
    @ApiParam("会议内容")
    private String desc;
    /**
     * 工作流实例ID
     */
    @ApiParam("工作流实例ID")
    private String instanceId;
    /**
     * 状态（1未开始，2进行中，3已结束）
     */
    @ApiParam("状态（1未开始，2进行中，3已结束）")
    private int status;
    /**
     * 创建时间
     */
    @ApiParam("创建时间")
    private Date createTime;


}