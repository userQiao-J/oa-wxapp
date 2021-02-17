package com.userqiao.linework.service.impl;

import com.userqiao.linework.dao.TbCheckinDao;
import com.userqiao.linework.entity.TbCheckin;
import com.userqiao.linework.service.TbCheckinService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 签到表(TbCheckin)表服务实现类
 *
 * @author makejava
 * @since 2021-02-17 00:21:52
 */
@Service("tbCheckinService")
public class TbCheckinServiceImpl implements TbCheckinService {
    @Resource
    private TbCheckinDao tbCheckinDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbCheckin queryById(Integer id) {
        return this.tbCheckinDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbCheckin> queryAllByLimit(int offset, int limit) {
        return this.tbCheckinDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbCheckin 实例对象
     * @return 实例对象
     */
    @Override
    public TbCheckin insert(TbCheckin tbCheckin) {
        this.tbCheckinDao.insert(tbCheckin);
        return tbCheckin;
    }

    /**
     * 修改数据
     *
     * @param tbCheckin 实例对象
     * @return 实例对象
     */
    @Override
    public TbCheckin update(TbCheckin tbCheckin) {
        this.tbCheckinDao.update(tbCheckin);
        return this.queryById(tbCheckin.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tbCheckinDao.deleteById(id) > 0;
    }
}