package com.example.demo.controller;

import com.example.demo.dto.UserDataDTO;
import com.example.demo.service.IUserService;
import com.example.demo.vo.UserDataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * This is the controller class for the user page.
 *
 * @author FoneZzz
 */
@RestController
@RequestMapping("/api")
public class UserController {
    private static final int USER_LIST_SIZE = 10;
    @Autowired
    private IUserService userService;

    /**
     * Get user list.
     *
     * @return {@link List<UserDataVO>}
     */
    @GetMapping("/user")
    public List<UserDataVO> getUserList(UserDataDTO requestDto) {
        System.out.println("get user list");
        return userService.getUserList(requestDto);
    }

    /**
     * Get user detail.
     *
     * @param id id
     * @return {@link UserDataVO}
     */
    @GetMapping("/user/{id}")
    public UserDataVO getUserDetail(@PathVariable Integer id) {
        System.out.println("get user detail id: " + id);
        UserDataVO userDataVO = new UserDataVO();
        userDataVO.setAge(id);
        return userDataVO;
    }

    /**
     * Insert user.
     *
     * @param requestDto {@link UserDataDTO}
     * @return {@link int}
     */
    @PostMapping("/user")
    public int insertUser(@RequestBody UserDataDTO requestDto) {
        System.out.println("insert user name: " + requestDto.getName());
        System.out.println(requestDto);
        return userService.insertUser(requestDto);
    }

    /**
     * Update user.
     *
     * @param requestDto {@link UserDataDTO}
     * @return {@link UserDataVO}
     */
    @PutMapping("/user")
    public int updateUser(@RequestBody UserDataDTO requestDto) {
        System.out.println("update user id: " + requestDto.getId());
        System.out.println(requestDto);
        return userService.updateUser(requestDto);
    }

    /**
     * Delete user.
     *
     * @param id id
     * @return {@link UserDataVO}
     */
    @DeleteMapping("/user/{id}")
    public Boolean deleteUser(@PathVariable Integer id) {
        // TODO: delete user
        System.out.println("delete user id: " + id);
        return true;
    }
}
