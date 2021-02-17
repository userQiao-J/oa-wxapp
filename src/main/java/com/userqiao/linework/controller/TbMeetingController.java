package com.userqiao.linework.controller;

import com.userqiao.linework.entity.TbMeeting;
import com.userqiao.linework.service.TbMeetingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 会议表(TbMeeting)表控制层
 *
 * @author makejava
 * @since 2021-02-17 00:21:58
 */
@RestController
@RequestMapping("tbMeeting")
public class TbMeetingController {
    /**
     * 服务对象
     */
    @Resource
    private TbMeetingService tbMeetingService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public TbMeeting selectOne(Object id) {
        return this.tbMeetingService.queryById(id);
    }

}