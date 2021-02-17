package com.userqiao.linework.service.impl;

import com.userqiao.linework.dao.TbHolidaysDao;
import com.userqiao.linework.entity.TbHolidays;
import com.userqiao.linework.service.TbHolidaysService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 节假日表(TbHolidays)表服务实现类
 *
 * @author makejava
 * @since 2021-02-17 00:21:57
 */
@Service("tbHolidaysService")
public class TbHolidaysServiceImpl implements TbHolidaysService {
    @Resource
    private TbHolidaysDao tbHolidaysDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbHolidays queryById(Integer id) {
        return this.tbHolidaysDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbHolidays> queryAllByLimit(int offset, int limit) {
        return this.tbHolidaysDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbHolidays 实例对象
     * @return 实例对象
     */
    @Override
    public TbHolidays insert(TbHolidays tbHolidays) {
        this.tbHolidaysDao.insert(tbHolidays);
        return tbHolidays;
    }

    /**
     * 修改数据
     *
     * @param tbHolidays 实例对象
     * @return 实例对象
     */
    @Override
    public TbHolidays update(TbHolidays tbHolidays) {
        this.tbHolidaysDao.update(tbHolidays);
        return this.queryById(tbHolidays.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tbHolidaysDao.deleteById(id) > 0;
    }
}