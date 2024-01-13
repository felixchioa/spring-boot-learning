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

    @GetMapping("/user/{id}")
    public UserDataVO getUserDetail(@PathVariable Integer id) {
        System.out.println("get user detail id: " + id);
        UserDataVO userDataVO = new UserDataVO();
        userDataVO.setAge(id);
        return userDataVO;
    }

    @PostMapping("/user")
    public UserDataDTO insertUser(@RequestBody UserDataDTO dto) {
        // TODO: insert user
        System.out.println("insert user id: " + dto.getId());
        System.out.println(dto);
        return dto;
    }

    @PutMapping("/user")
    public UserDataDTO updateUser(@RequestBody UserDataDTO dto) {
        // TODO: update user
        System.out.println("update user id: " + dto.getId());
        System.out.println(dto);
        return dto;
    }

    @DeleteMapping("/user/{id}")
    public Boolean deleteUser(@PathVariable Integer id) {
        // TODO: delete user
        System.out.println("delete user id: " + id);
        return true;
    }
}
