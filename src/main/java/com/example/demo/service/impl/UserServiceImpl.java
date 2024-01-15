package com.example.demo.service.impl;

import com.example.demo.dto.UserDataDTO;
import com.example.demo.exception.ServiceException;
import com.example.demo.mapper.UserMapper;
import com.example.demo.service.IUserService;
import com.example.demo.vo.UserDataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * This is the service class for the user page.
 *
 * @author FoneZzz
 */
@Service
public class UserServiceImpl implements IUserService {
    private static final String ADMIN_USER = "admin";

    private final UserMapper userMapper;

    /**
     * Constructor.
     *
     * @param userMapper
     *            {@link UserMapper}
     */
    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    /**
     * Get user list.
     *
     * @param requestDto
     *            {@link UserDataDTO}
     * @return {@link List<UserDataVO>}
     */
    @Override
    public List<UserDataVO> getUserList(UserDataDTO requestDto) {
        return userMapper.getUserList(requestDto);
    }

    /**
     * Get user list.
     *
     * @param requestDto
     *            {@link UserDataDTO}
     * @return {@link List<UserDataVO>}
     */
    @Override
    public List<UserDataVO> getUserListLikeName(UserDataDTO requestDto) {
        return userMapper.getUserListLikeName(requestDto);
    }

    /**
     * Get user detail.
     *
     * @param id
     *            {@link Integer}
     * @return {@link UserDataVO}
     */
    public UserDataVO getUserById(Integer id) {
        return userMapper.getUserById(id);
    }

    /**
     * Insert user.
     *
     * @param requestDto
     *            {@link UserDataDTO}
     * @return {@link int}
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertUser(UserDataDTO requestDto) {
        // 正常逻辑
        // return userMapper.insertUser(requestDto);

        // 测试事务
        // try {
        // userMapper.insertUser(requestDto);
        // throw new RuntimeException("Test transactional");
        // } catch (Exception e) {
        // System.out.println("Error: " + e.getMessage());
        // }

        // 测试全局异常拦截器
        if (ADMIN_USER.equals(requestDto.getName())) {
            throw new ServiceException(ADMIN_USER + "用户不允许添加");
        }

        return userMapper.insertUser(requestDto);
    }

    /**
     * Insert users.
     *
     * @param users
     *            users
     * @return {@link int}
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int insertUsers(List<UserDataDTO> users) {
        return userMapper.insertUsers(users);
    }

    /**
     * Update user.
     *
     * @param requestDto
     *            {@link UserDataDTO}
     * @return {@link int}
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int updateUser(UserDataDTO requestDto) {
        return userMapper.updateUser(requestDto);
    }

    /**
     * Delete user.
     *
     * @param id
     *            id
     * @return {@link int}
     */
    @Override
    @Transactional(rollbackFor = Exception.class)
    public int deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }
}
