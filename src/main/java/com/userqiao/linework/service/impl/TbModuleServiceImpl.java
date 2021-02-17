package com.userqiao.linework.service.impl;

import com.userqiao.linework.dao.TbModuleDao;
import com.userqiao.linework.entity.TbModule;
import com.userqiao.linework.service.TbModuleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 模块资源表(TbModule)表服务实现类
 *
 * @author makejava
 * @since 2021-02-17 00:21:59
 */
@Service("tbModuleService")
public class TbModuleServiceImpl implements TbModuleService {
    @Resource
    private TbModuleDao tbModuleDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbModule queryById(Integer id) {
        return this.tbModuleDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbModule> queryAllByLimit(int offset, int limit) {
        return this.tbModuleDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbModule 实例对象
     * @return 实例对象
     */
    @Override
    public TbModule insert(TbModule tbModule) {
        this.tbModuleDao.insert(tbModule);
        return tbModule;
    }

    /**
     * 修改数据
     *
     * @param tbModule 实例对象
     * @return 实例对象
     */
    @Override
    public TbModule update(TbModule tbModule) {
        this.tbModuleDao.update(tbModule);
        return this.queryById(tbModule.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tbModuleDao.deleteById(id) > 0;
    }
}