package com.userqiao.linework.service;

import com.userqiao.linework.entity.TbUser;

import java.util.List;
import java.util.Set;

/**
 * 用户表(TbUser)表服务接口
 *
 * @author makejava
 * @since 2021-02-17 00:22:02
 */
public interface TbUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    TbUser queryById(Integer id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<TbUser> queryAllByLimit(int offset, int limit);


    /**
     * 修改数据
     *
     * @param tbUser 实例对象
     * @return 实例对象
     */
    TbUser update(TbUser tbUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Integer id);

    /**
     * 根据用户Code获取openId
     * @param code
     * @return
     */
    String getOpenId(String code);

    /**
     * 用户注册
     * @param registerCode
     * @param code
     * @param nickname
     * @param photo
     * @return
     */
    int registerUser(String registerCode,String code,String nickname,String photo);

    /**
     * 查询用户权限列表
     * @param userId
     * @return
     */
    Set<String> searchUserPermissions(int userId);

    /**
     * 登录方法
     * @param code
     * @return
     */
    Integer login(String code);
}