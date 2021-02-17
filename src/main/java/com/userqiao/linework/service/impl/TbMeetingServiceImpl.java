package com.userqiao.linework.service.impl;

import com.userqiao.linework.dao.TbMeetingDao;
import com.userqiao.linework.entity.TbMeeting;
import com.userqiao.linework.service.TbMeetingService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 会议表(TbMeeting)表服务实现类
 *
 * @author makejava
 * @since 2021-02-17 00:21:58
 */
@Service("tbMeetingService")
public class TbMeetingServiceImpl implements TbMeetingService {
    @Resource
    private TbMeetingDao tbMeetingDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbMeeting queryById(Object id) {
        return this.tbMeetingDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbMeeting> queryAllByLimit(int offset, int limit) {
        return this.tbMeetingDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbMeeting 实例对象
     * @return 实例对象
     */
    @Override
    public TbMeeting insert(TbMeeting tbMeeting) {
        this.tbMeetingDao.insert(tbMeeting);
        return tbMeeting;
    }

    /**
     * 修改数据
     *
     * @param tbMeeting 实例对象
     * @return 实例对象
     */
    @Override
    public TbMeeting update(TbMeeting tbMeeting) {
        this.tbMeetingDao.update(tbMeeting);
        return this.queryById(tbMeeting.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.tbMeetingDao.deleteById(id) > 0;
    }
}