package com.userqiao.linework.dao;

import com.userqiao.linework.entity.TbFaceModel;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (TbFaceModel)表数据库访问层
 *
 * @author makejava
 * @since 2021-02-17 00:21:56
 */
@Mapper
public interface TbFaceModelDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbFaceModel queryById(Integer id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbFaceModel> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param tbFaceModel 实例对象
     * @return 对象列表
     */
    List<TbFaceModel> queryAll(TbFaceModel tbFaceModel);

    /**
     * 新增数据
     *
     * @param tbFaceModel 实例对象
     * @return 影响行数
     */
    int insert(TbFaceModel tbFaceModel);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbFaceModel> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<TbFaceModel> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<TbFaceModel> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<TbFaceModel> entities);

    /**
     * 修改数据
     *
     * @param tbFaceModel 实例对象
     * @return 影响行数
     */
    int update(TbFaceModel tbFaceModel);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Integer id);

}