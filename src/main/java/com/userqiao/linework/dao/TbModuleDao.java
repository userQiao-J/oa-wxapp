package com.userqiao.linework.dao;

import com.userqiao.linework.entity.TbModule;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 模块资源表(TbModule)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-17 00:21:59
 */
@Mapper
public interface TbModuleDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbModule queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbModule> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbModule 实例对象
     * @return 对象列表
     */
    List<TbModule> queryAll(TbModule tbModule);

    /**
     * 新增数据
     *
     * @param tbModule 实例对象
     * @return 影响行数
     */
    int insert(TbModule tbModule);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbModule> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbModule> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbModule> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TbModule> entities);

    /**
     * 修改数据
     *
     * @param tbModule 实例对象
     * @return 影响行数
     */
    int update(TbModule tbModule);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}