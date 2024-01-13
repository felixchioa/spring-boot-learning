package com.example.demo.mapper;

import com.example.demo.dto.UserDataDTO;
import com.example.demo.entity.User;
import com.example.demo.vo.UserDataVO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * This is the mapper interface for the user page.
 *
 * @author Fonezzz
 */
@Mapper
public interface UserMapper {
    /**
     * Get user list.
     *
     * @param requestDto {@link UserDataDTO}
     * @return {@link List<UserDataVO>}
     */
    @Select("SELECT * FROM m_user")
    List<UserDataVO> getUserList(@Param("req") UserDataDTO requestDto);

    /**
     * Get user detail.
     *
     * @param user user
     * @return {@link UserDataVO}
     */
    @Insert("INSERT INTO m_user (id, name, age) VALUES (#{user.id}, #{user.name}, #{user.age})")
    int insertUser(@Param("user") User user);

    /**
     * Get user detail.
     *
     * @param user user
     * @return {@link UserDataVO}
     */
    @Update("UPDATE m_user SET name = #{user.name}, age = #{user.age} WHERE id = #{user.id}")
    int updateUser(@Param("user") User user);

    /**
     * Get user detail.
     *
     * @param id id
     * @return {@link UserDataVO}
     */
    @Delete("DELETE FROM m_user WHERE id = #{id}")
    int deleteUser(@Param("id") Integer id);

}
