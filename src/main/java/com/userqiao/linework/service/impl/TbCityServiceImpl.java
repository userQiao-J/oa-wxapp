package com.userqiao.linework.service.impl;

import com.userqiao.linework.dao.TbCityDao;
import com.userqiao.linework.entity.TbCity;
import com.userqiao.linework.service.TbCityService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 疫情城市列表(TbCity)表服务实现类
 *
 * @author makejava
 * @since 2021-02-17 00:21:53
 */
@Service("tbCityService")
public class TbCityServiceImpl implements TbCityService {
    @Resource
    private TbCityDao tbCityDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbCity queryById(Integer id) {
        return this.tbCityDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbCity> queryAllByLimit(int offset, int limit) {
        return this.tbCityDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param tbCity 实例对象
     * @return 实例对象
     */
    @Override
    public TbCity insert(TbCity tbCity) {
        this.tbCityDao.insert(tbCity);
        return tbCity;
    }

    /**
     * 修改数据
     *
     * @param tbCity 实例对象
     * @return 实例对象
     */
    @Override
    public TbCity update(TbCity tbCity) {
        this.tbCityDao.update(tbCity);
        return this.queryById(tbCity.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tbCityDao.deleteById(id) > 0;
    }
}