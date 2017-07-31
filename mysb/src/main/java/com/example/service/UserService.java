package com.example.service;

import com.example.dao.pojo.UserPO;
import com.example.module.User;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/7/30.
 */
public interface UserService {
     UserPO getUserinfoByuPhone(String uPhone);
     int setUser(User user);
     Long getAllUserCount();
}
