package com.qm.service;

import com.qm.model.User;

/**
 * Created by yudi on 16/4/7.
 */
public interface UserService {
    Boolean delete(long id);
    Boolean insert(User user);
}
