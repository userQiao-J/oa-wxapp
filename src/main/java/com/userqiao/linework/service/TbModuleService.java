package com.userqiao.linework.service;

import com.userqiao.linework.entity.TbModule;

import java.util.List;

/**
 * 模块资源表(TbModule)表服务接口
 *
 * @author makejava
 * @since 2021-02-17 00:21:59
 */
public interface TbModuleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbModule queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbModule> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbModule 实例对象
     * @return 实例对象
     */
    TbModule insert(TbModule tbModule);

    /**
     * 修改数据
     *
     * @param tbModule 实例对象
     * @return 实例对象
     */
    TbModule update(TbModule tbModule);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}