package com.bjpowernode.day13.homework;

public class User {
    private String username;
    private String mobile;
    private String password;
    private String nickname;
    private String avatar;
    // 用户所在的组
    private UserGroup userGroup;


    public User(String username, String mobile, String password, String nickname, String avatar, UserGroup userGroup) {
        this.username = username;
        this.mobile = mobile;
        this.password = password;
        this.nickname = nickname;
        this.avatar = avatar;
        this.userGroup = userGroup;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public UserGroup getUserGroup() {
        return userGroup;
    }

    public void setUserGroup(UserGroup userGroup) {
        this.userGroup = userGroup;
    }
}
