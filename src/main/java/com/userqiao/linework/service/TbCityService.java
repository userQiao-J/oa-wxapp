package com.userqiao.linework.service;

import com.userqiao.linework.entity.TbCity;

import java.util.List;

/**
 * 疫情城市列表(TbCity)表服务接口
 *
 * @author makejava
 * @since 2021-02-17 00:21:53
 */
public interface TbCityService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbCity queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbCity> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbCity 实例对象
     * @return 实例对象
     */
    TbCity insert(TbCity tbCity);

    /**
     * 修改数据
     *
     * @param tbCity 实例对象
     * @return 实例对象
     */
    TbCity update(TbCity tbCity);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}