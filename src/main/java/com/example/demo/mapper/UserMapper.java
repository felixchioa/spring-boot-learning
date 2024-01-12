package com.example.demo.mapper;

import com.example.demo.dto.UserDataDTO;
import com.example.demo.entity.User;
import com.example.demo.vo.UserDataVO;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

    public interface UserMapper {
        @Select("SELECT * FROM user")
        List<UserDataVO> getUserList(@Param("req") UserDataDTO requestDto);

        int insertUser(@Param("user") User user);

}
