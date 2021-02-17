package com.userqiao.linework.service.impl;

import com.userqiao.linework.dao.TbDeptDao;
import com.userqiao.linework.entity.TbDept;
import com.userqiao.linework.service.TbDeptService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbDept)表服务实现类
 *
 * @author makejava
 * @since 2021-02-17 00:21:55
 */
@Service("tbDeptService")
public class TbDeptServiceImpl implements TbDeptService {
    @Resource
    private TbDeptDao tbDeptDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbDept queryById(Integer id) {
        return this.tbDeptDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbDept> queryAllByLimit(int offset, int limit) {
        return this.tbDeptDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbDept 实例对象
     * @return 实例对象
     */
    @Override
    public TbDept insert(TbDept tbDept) {
        this.tbDeptDao.insert(tbDept);
        return tbDept;
    }

    /**
     * 修改数据
     *
     * @param tbDept 实例对象
     * @return 实例对象
     */
    @Override
    public TbDept update(TbDept tbDept) {
        this.tbDeptDao.update(tbDept);
        return this.queryById(tbDept.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tbDeptDao.deleteById(id) > 0;
    }
}