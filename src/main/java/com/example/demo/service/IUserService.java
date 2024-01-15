package com.example.demo.service;

import com.example.demo.dto.UserDataDTO;
import com.example.demo.vo.UserDataVO;

import java.util.List;

/**
 * This is the service interface for the user page.
 *
 * @author FoneZzz
 */
public interface IUserService {
    /**
     * Get user list.
     *
     * @param dto
     *            {@link UserDataDTO}
     * @return {@link List<UserDataVO>}
     */
    List<UserDataVO> getUserList(UserDataDTO dto);

    /**
     * Get user list.
     *
     * @param dto
     *            {@link UserDataDTO}
     * @return {@link List<UserDataVO>}
     */
    List<UserDataVO> getUserListLikeName(UserDataDTO dto);

    /**
     * Get user detail.
     *
     * @param id
     *            {@link Integer}
     * @return {@link UserDataVO}
     */
    UserDataVO getUserById(Integer id);

    /**
     * Insert user.
     *
     * @param dto
     *            {@link UserDataDTO}
     * @return {@link int}
     */
    int insertUser(UserDataDTO dto);

    /**
     * Insert users.
     *
     * @param users
     *            users
     * @return {@link int}
     */
    int insertUsers(List<UserDataDTO> users);

    /**
     * Update user.
     *
     * @param dto
     *            {@link UserDataDTO}
     * @return {@link UserDataVO}
     */
    int updateUser(UserDataDTO dto);

    /**
     * Delete user.
     *
     * @param id
     *            id
     * @return {@link UserDataVO}
     */
    int deleteUser(Integer id);
}
