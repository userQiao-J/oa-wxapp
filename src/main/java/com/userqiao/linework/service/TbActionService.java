package com.userqiao.linework.service;

import com.userqiao.linework.entity.TbAction;

import java.util.List;

/**
 * 行为表(TbAction)表服务接口
 *
 * @author makejava
 * @since 2021-02-17 00:21:50
 */
public interface TbActionService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbAction queryById(Object id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbAction> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbAction 实例对象
     * @return 实例对象
     */
    TbAction insert(TbAction tbAction);

    /**
     * 修改数据
     *
     * @param tbAction 实例对象
     * @return 实例对象
     */
    TbAction update(TbAction tbAction);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Object id);

}