package com.example.demo.vo;

/**
 * @author FoneZzz
 */
public class UserDataVO {
    /**
     * Returns a string representation of the UserDataVO object.
     *
     * @return the string representation of the UserDataVO object.
     */
    @Override
    public String toString() {
        return "UserDataVO{" +
                "username='" + username + '\'' +
                ", age=" + age +
                '}';
    }

    private String username;
    private Integer age;

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
}
