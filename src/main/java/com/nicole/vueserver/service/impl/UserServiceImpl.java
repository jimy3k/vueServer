package com.nicole.vueserver.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.nicole.vueserver.mapper.UserMapper;
import com.nicole.vueserver.entity.User;
import com.nicole.vueserver.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
