package com.fhamster.dolldrobe.service;

import com.fhamster.dolldrobe.dao.UserMapper;
import com.fhamster.dolldrobe.model.User;
import com.fhamster.dolldrobe.model.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    UserMapper dao;

    /**
     * 检查用户帐号密码
     *
     * @param acc 帐号
     * @param psw 密码
     * @return true 帐号与密码匹配返回 否则false
     */
    public boolean isPswMatch(String acc, String psw) {
        try {
            User user = dao.selectByPrimaryKey(acc);
            if (user.getuPsw().equals(psw)) {
                return true;
            } else {
                throw new Exception("用户名和密码不匹配");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }


    /**
     * 检查用户帐号密码
     *
     * @param acc 帐号
     * @param psw 密码
     * @return true 帐号与密码匹配返回 否则false
     */
    public boolean isPswMatch2(String acc, String psw) {

        UserExample example = new UserExample();
        example.createCriteria()
                .andUAccountnumberEqualTo(acc)
                .andUPswEqualTo(psw);

        return dao.selectByExampleWithBLOBs(example).size() > 0;
    }

    /**
     * 检查帐号唯一
     *
     * @param acc 参与检查的用户帐号
     * @return true 用户帐号唯一返回 否则false
     */
    public boolean isAccUnique(String acc) {
        UserExample example = new UserExample();
        example.createCriteria()
                .andUAccountnumberEqualTo(acc);


        long n = (long) dao.selectByExampleWithBLOBs(example).size();

        return n < 1;
    }

    /**
     * 向数据库中插入新的用户
     * 要检查用户名重复
     *
     * @param user user对象
     */
    public void addtUser(User user) {
        User test = dao.selectByPrimaryKey(user.getuAccountnumber());


        try {
            if (test == null) {
                dao.insertSelective(user);
            } else {
                //DONE 用户表中已存在该用户账号,抛出
                throw new Exception("该用户帐号已经存在");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
