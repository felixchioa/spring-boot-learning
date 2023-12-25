package com.example.demo.controller;

import com.example.demo.dto.UserDataDTO;
import com.example.demo.service.IUserService;
import com.example.demo.vo.UserDataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * This is the controller class for the user page.
 *
 * @since 1.0.0 2020/4/14
 * @author FoneZzz
 */
@RestController
@RequestMapping("/api")
public class UserController {

    @Resource
    private IUserService userService;

    @GetMapping("/user")
    public List<UserDataVO> getUserList() {
        List<UserDataVO> userList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            UserDataVO userDataVO = new UserDataVO();
            userDataVO.setAge(i);
            userDataVO.setUsername("user" + i);
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
        System.out.println("delete user id: " + id);
        return true;
    }
}
