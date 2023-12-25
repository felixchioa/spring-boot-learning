package com.example.demo.dto;

/**
 * @author: FoneZzz
 */
public class UserDataDTO {
    /**
     * Returns a string representation of the UserDataDTO object.
     *
     * @return the string representation of the UserDataDTO object.
     */
    @Override
    public String toString() {
        return "UserDataDTO{" +
                "username='" + username + '\'' +
                ", age=" + age +
                ", id=" + id +
                '}';
    }

    private String username;
    private Integer age;
    private Integer id;

    public UserDataDTO() {

    }

    public String getUsername() {
        return username;
    }

    public int getAge() {
        return age;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
