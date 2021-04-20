package com.pronhub.newsserver.serviceimpl;

import com.pronhub.newsserver.mapper.UserMapper;
import com.pronhub.newsserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
}
