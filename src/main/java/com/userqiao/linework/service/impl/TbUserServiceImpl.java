package com.userqiao.linework.service.impl;

import com.userqiao.linework.dao.TbUserDao;
import com.userqiao.linework.entity.TbUser;
import com.userqiao.linework.exception.LineWorkException;
import com.userqiao.linework.service.TbUserService;
import com.userqiao.linework.wx.WxServer;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.*;

/**
 * 用户表(TbUser)表服务实现类
 *
 * @author makejava
 * @since 2021-02-17 00:22:02
 */
@Service("tbUserService")
public class TbUserServiceImpl implements TbUserService {
    @Resource
    private TbUserDao tbUserDao;
    @Resource
    private WxServer wxServer;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public TbUser queryById(Integer id) {
        return this.tbUserDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    @Override
    public List<TbUser> queryAllByLimit(int offset, int limit) {
        return this.tbUserDao.queryAllByLimit(offset, limit);
    }


    /**
     * 修改数据
     *
     * @param tbUser 实例对象
     * @return 实例对象
     */
    @Override
    public TbUser update(TbUser tbUser) {
        this.tbUserDao.update(tbUser);
        return this.queryById(tbUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer id) {
        return this.tbUserDao.deleteById(id) > 0;
    }

    @Override
    public String getOpenId(String code) {
        String openId = wxServer.getOpenIdByUser(code);
        if (openId == null || openId.length() == 0){
            throw new RuntimeException("临时登录凭证错误");
        }
        return openId;
    }

    @Override
    public int registerUser(String registerCode, String code, String nickname, String photo) {
        //如果邀请码是000000，代表是超级管理员
        if (registerCode.equals("000000")){
            //查询超级管理员帐户是否已经绑定
            boolean bool = tbUserDao.haveAdminUser();
            if (!bool) {
                //把当前用户绑定到ROOT帐户
                String openId = getOpenId(code);
                Map param = new HashMap();
                param.put("openId", openId);
                param.put("nickname", nickname);
                param.put("photo", photo);
                param.put("role", "[0]");
                param.put("status", 1);
                param.put("createTime", new Date());
                param.put("root", true);
                tbUserDao.insert(param);
                int id = tbUserDao.searchIdByOpenId(openId);
                return id;
            } else {
                //如果root已经绑定了，就抛出异常
                throw new LineWorkException("无法绑定超级管理员账号");
            }
        }
        return 0;
    }

    @Override
    public Set<String> searchUserPermissions(int userId) {
        Set<String> permissions=tbUserDao.searchUserPermissions(userId);
        return permissions;
    }
}