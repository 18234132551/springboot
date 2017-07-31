package com.example.service;

import com.example.dao.mapper.UserPOMapper;
import com.example.dao.pojo.UserPO;
import com.example.dao.pojo.UserPOExample;
import com.example.module.User;
import com.example.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2017/7/30.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserPOMapper userPOMapper;
    @Override
    public UserPO getUserinfoByuPhone(String uPhone) {
        UserPOExample userPOExample = new UserPOExample();
        userPOExample.createCriteria().andUphoneEqualTo(uPhone);
        List<UserPO> userPOlists= userPOMapper.selectByExample(userPOExample);
        if (userPOlists.size()<1){
            return null;
        }else if(userPOlists.size()==1){
            return userPOlists.get(0);
        }else {
            System.out.println(uPhone+"一条电话对应多个用户");
            return userPOlists.get(0);
        }
    }

    @Override
    public int setUser(User user) {
        //插入一条数据只插入不为空的数据
        UserPO userPO = new UserPO();
        userPO.setUage(user.getuAge());
        userPO.setUemail(user.getuEmail());
        userPO.setUid(MD5Util.getMD5(user.getuPhone()));
        userPO.setUname(user.getuName());
        userPO.setUphone(user.getuPhone());
        int status = userPOMapper.insertSelective(userPO);
        return status;
    }

    @Override
    public Long getAllUserCount() {
        UserPOExample userPOExample  = new UserPOExample();
        userPOExample.createCriteria().andIdIsNotNull();
        long count = userPOMapper.countByExample(userPOExample);
        return count;
    }
}
