/*
package com.fhamster.dolldrobe.service;

import com.fhamster.dolldrobe.dao.UserMapper;
import com.fhamster.dolldrobe.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.print.DocFlavor;

@Service
@Transactional
public class RegService {
    @Autowired
    UserMapper dao;

    public void InsertUser(String UAcc, String UName, String UPic, String UPsw, String USex, String UTel, String UEmail, String UQQ, String UWX) {
        User user = new User(UAcc, UName, UPic, UPsw, USex, UTel, UEmail, UQQ, UWX);
        User user1 = dao.selectByPrimaryKey(UAcc);
//todo        用户表中已存在该用户账号,抛出
        try {
            if (!user1.getuAccountnumber().equals(user.getuAccountnumber())) {
                dao.insert(user);
            }
        } catch (Exception e) {

        }
    }
}
*/
