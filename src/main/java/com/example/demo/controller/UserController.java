package com.example.demo.controller;

import com.example.demo.dto.UserDataDTO;
import com.example.demo.vo.UserDataVO;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
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

    @GetMapping("/user")
    public List<UserDataVO> getUserList() {
        List<UserDataVO> userList = new ArrayList<>();
        for (int i = 0; i < USER_LIST_SIZE; i++) {
            UserDataVO userDataVO = new UserDataVO();
            userDataVO.setAge(i);
            userDataVO.setUsername("user" + i);
            System.out.println(userDataVO);
            userList.add(userDataVO);
        }

        return userList;
    }

    @GetMapping("/user/{id}")
    public UserDataVO getUserDetail(@PathVariable Integer id) {
        System.out.println("get user detail id: " + id);
        UserDataVO userDataVO = new UserDataVO();
        userDataVO.setAge(id);
        userDataVO.setUsername("user" + id);
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
        return dto;
    }

    @DeleteMapping("/user/{id}")
    public Boolean deleteUser(@PathVariable Integer id) {
        // TODO: delete user
        System.out.println("delete user id: " + id);
        return true;
    }
}
