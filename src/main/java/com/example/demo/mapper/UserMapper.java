package com.example.demo.mapper;

import com.example.demo.dto.UserDataDTO;
import com.example.demo.vo.UserDataVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

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
//    @Select("SELECT * FROM m_user")
    List<UserDataVO> getUserList(@Param("user") UserDataDTO requestDto);

    /**
     * Get user list.
     *
     * @param requestDto {@link UserDataDTO}
     * @return {@link List<UserDataVO>}
     */
    List<UserDataVO> getUserListLikeName(@Param("user") UserDataDTO requestDto);

    /**
     * Insert user.
     *
     * @param user user
     * @return {@link int}
     */
//    @Insert("INSERT INTO m_user (id, name, age) VALUES (#{user.id}, #{user.name}, #{user.age})")
    int insertUser(@Param("user") UserDataDTO user);

    /**
     * Insert users.
     *
     * @param users users
     * @return {@link int}
     */
    int insertUsers(@Param("list") List<UserDataDTO> users);

    /**
     * Get user detail.
     *
     * @param user user
     * @return {@link UserDataVO}
     */
//    @Update("UPDATE m_user SET name = #{user.name}, age = #{user.age} WHERE id = #{user.id}")
    int updateUser(@Param("user") UserDataDTO user);

    /**
     * Get user detail.
     *
     * @param id id
     * @return {@link UserDataVO}
     */
//    @Delete("DELETE FROM m_user WHERE id = #{id}")
    int deleteUser(@Param("id") Integer id);
}
