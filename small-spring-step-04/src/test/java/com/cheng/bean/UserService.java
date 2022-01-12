package com.cheng.bean;

import lombok.Data;

/**
 * @author chengwuchao
 * @date 2022/1/10
 */
@Data
public class UserService {
    private String uId;

    private UserDao userDao;

    public void queryUserInfo() {
        System.out.println("查询用户信息：" + userDao.queryUserName(uId));
    }
}
