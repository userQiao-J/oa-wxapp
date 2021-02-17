package com.userqiao.linework.dao;

import com.userqiao.linework.entity.TbAction;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 行为表(TbAction)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-17 00:21:49
 */
@Mapper
public interface TbActionDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbAction queryById(Object id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbAction> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbAction 实例对象
     * @return 对象列表
     */
    List<TbAction> queryAll(TbAction tbAction);

    /**
     * 新增数据
     *
     * @param tbAction 实例对象
     * @return 影响行数
     */
    int insert(TbAction tbAction);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbAction> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbAction> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbAction> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TbAction> entities);

    /**
     * 修改数据
     *
     * @param tbAction 实例对象
     * @return 影响行数
     */
    int update(TbAction tbAction);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Object id);

}