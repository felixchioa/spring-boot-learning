package com.example.demo.service.impl;

import com.example.demo.dto.UserDataDTO;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IUserService;
import com.example.demo.vo.UserDataVO;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


/**
 * @author FoneZzz
 */
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDataVO> getUserList(UserDataDTO requestDto) {
        return userMapper.getUserList(requestDto);
    }
}
