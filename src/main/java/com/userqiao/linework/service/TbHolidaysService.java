package com.userqiao.linework.service;

import com.userqiao.linework.entity.TbHolidays;

import java.util.List;

/**
 * 节假日表(TbHolidays)表服务接口
 *
 * @author makejava
 * @since 2021-02-17 00:21:57
 */
public interface TbHolidaysService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbHolidays queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbHolidays> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbHolidays 实例对象
     * @return 实例对象
     */
    TbHolidays insert(TbHolidays tbHolidays);

    /**
     * 修改数据
     *
     * @param tbHolidays 实例对象
     * @return 实例对象
     */
    TbHolidays update(TbHolidays tbHolidays);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}