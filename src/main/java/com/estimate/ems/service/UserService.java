package com.estimate.ems.service;

import com.estimate.ems.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
