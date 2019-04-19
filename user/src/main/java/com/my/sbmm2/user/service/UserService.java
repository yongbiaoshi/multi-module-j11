package com.my.sbmm2.user.service;

import com.my.sbmm2.user.entity.po.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Optional<User> findById(long id);
    List<User> findByName(String name);
}
