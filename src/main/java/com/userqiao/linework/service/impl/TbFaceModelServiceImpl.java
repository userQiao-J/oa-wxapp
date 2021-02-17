package com.userqiao.linework.service.impl;

import com.userqiao.linework.dao.TbFaceModelDao;
import com.userqiao.linework.entity.TbFaceModel;
import com.userqiao.linework.service.TbFaceModelService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (TbFaceModel)表服务实现类
 *
 * @author makejava
 * @since 2021-02-17 00:21:56
 */
@Service("tbFaceModelService")
public class TbFaceModelServiceImpl implements TbFaceModelService {
    @Resource
    private TbFaceModelDao tbFaceModelDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbFaceModel queryById(Integer id) {
        return this.tbFaceModelDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbFaceModel> queryAllByLimit(int offset, int limit) {
        return this.tbFaceModelDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbFaceModel 实例对象
     * @return 实例对象
     */
    @Override
    public TbFaceModel insert(TbFaceModel tbFaceModel) {
        this.tbFaceModelDao.insert(tbFaceModel);
        return tbFaceModel;
    }

    /**
     * 修改数据
     *
     * @param tbFaceModel 实例对象
     * @return 实例对象
     */
    @Override
    public TbFaceModel update(TbFaceModel tbFaceModel) {
        this.tbFaceModelDao.update(tbFaceModel);
        return this.queryById(tbFaceModel.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tbFaceModelDao.deleteById(id) > 0;
    }
}