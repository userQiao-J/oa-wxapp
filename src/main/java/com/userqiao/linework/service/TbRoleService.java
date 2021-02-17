package com.userqiao.linework.service;

import com.userqiao.linework.entity.TbRole;

import java.util.List;

/**
 * 角色表(TbRole)表服务接口
 *
 * @author makejava
 * @since 2021-02-17 00:22:01
 */
public interface TbRoleService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbRole queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbRole> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param tbRole 实例对象
     * @return 实例对象
     */
    TbRole insert(TbRole tbRole);

    /**
     * 修改数据
     *
     * @param tbRole 实例对象
     * @return 实例对象
     */
    TbRole update(TbRole tbRole);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

}