package com.example.demo.service;

import com.example.demo.dto.UserDataDTO;
import com.example.demo.vo.UserDataVO;

import java.util.List;

/**
 * @author FoneZzz
 */
public interface IUserService {
    List<UserDataVO> getUserList(UserDataDTO dto);
}
