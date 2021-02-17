package com.userqiao.linework.service;

import com.userqiao.linework.entity.TbMeeting;

import java.util.List;

/**
 * 会议表(TbMeeting)表服务接口
 *
 * @author makejava
 * @since 2021-02-17 00:21:58
 */
public interface TbMeetingService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbMeeting queryById(Object id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbMeeting> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbMeeting 实例对象
     * @return 实例对象
     */
    TbMeeting insert(TbMeeting tbMeeting);

    /**
     * 修改数据
     *
     * @param tbMeeting 实例对象
     * @return 实例对象
     */
    TbMeeting update(TbMeeting tbMeeting);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Object id);

}