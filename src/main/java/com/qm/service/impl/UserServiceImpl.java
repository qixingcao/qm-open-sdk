package com.qm.service.impl;

import com.qm.dao.UserDao;
import com.qm.model.User;
import com.qm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by yudi on 16/4/7.
 */
@Service
public class UserServiceImpl implements UserService {
    private final UserDao userDao;
    @Autowired
    public UserServiceImpl(UserDao userDao){
        this.userDao=userDao;
    }
    public Boolean delete(long id) {
        return null;
    }

    public Boolean insert(User user) {
        return null;
    }
}
