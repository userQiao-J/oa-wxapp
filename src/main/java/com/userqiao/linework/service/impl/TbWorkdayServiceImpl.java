package com.userqiao.linework.service.impl;

import com.userqiao.linework.dao.TbWorkdayDao;
import com.userqiao.linework.entity.TbWorkday;
import com.userqiao.linework.service.TbWorkdayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbWorkday)表服务实现类
 *
 * @author makejava
 * @since 2021-02-17 00:22:03
 */
@Service("tbWorkdayService")
public class TbWorkdayServiceImpl implements TbWorkdayService {
    @Resource
    private TbWorkdayDao tbWorkdayDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbWorkday queryById(Integer id) {
        return this.tbWorkdayDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbWorkday> queryAllByLimit(int offset, int limit) {
        return this.tbWorkdayDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbWorkday 实例对象
     * @return 实例对象
     */
    @Override
    public TbWorkday insert(TbWorkday tbWorkday) {
        this.tbWorkdayDao.insert(tbWorkday);
        return tbWorkday;
    }

    /**
     * 修改数据
     *
     * @param tbWorkday 实例对象
     * @return 实例对象
     */
    @Override
    public TbWorkday update(TbWorkday tbWorkday) {
        this.tbWorkdayDao.update(tbWorkday);
        return this.queryById(tbWorkday.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tbWorkdayDao.deleteById(id) > 0;
    }
}