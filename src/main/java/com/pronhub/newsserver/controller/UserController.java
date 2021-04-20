package com.pronhub.newsserver.controller;

import com.pronhub.newsserver.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService mUserService;
}
