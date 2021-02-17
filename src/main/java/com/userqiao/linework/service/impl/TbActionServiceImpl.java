package com.userqiao.linework.service.impl;

import com.userqiao.linework.dao.TbActionDao;
import com.userqiao.linework.entity.TbAction;
import com.userqiao.linework.service.TbActionService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 行为表(TbAction)表服务实现类
 *
 * @author makejava
 * @since 2021-02-17 00:21:50
 */
@Service("tbActionService")
public class TbActionServiceImpl implements TbActionService {
    @Resource
    private TbActionDao tbActionDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbAction queryById(Object id) {
        return this.tbActionDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbAction> queryAllByLimit(int offset, int limit) {
        return this.tbActionDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbAction 实例对象
     * @return 实例对象
     */
    @Override
    public TbAction insert(TbAction tbAction) {
        this.tbActionDao.insert(tbAction);
        return tbAction;
    }

    /**
     * 修改数据
     *
     * @param tbAction 实例对象
     * @return 实例对象
     */
    @Override
    public TbAction update(TbAction tbAction) {
        this.tbActionDao.update(tbAction);
        return this.queryById(tbAction.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Object id) {
        return this.tbActionDao.deleteById(id) > 0;
    }
}