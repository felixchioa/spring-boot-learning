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
     * Get user list.
     *
     * @param requestDto {@link UserDataDTO}
     * @return {@link List<UserDataVO>}
     */
    @PostMapping("/users/name")
    public List<UserDataVO> getUserListLikeName(@RequestBody UserDataDTO requestDto) {
        System.out.println("get user list name like : " + requestDto.getName());
        return userService.getUserListLikeName(requestDto);
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
     * Insert users.
     *
     * @param users {@link List<UserDataDTO>}
     * @return {@link int}
     */
    @PostMapping("/users")
    public int insertUsers(@RequestBody List<UserDataDTO> users) {
        return userService.insertUsers(users);
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
    public int deleteUser(@PathVariable Integer id) {
        System.out.println("delete user id: " + id);
        return userService.deleteUser(id);
    }
}
