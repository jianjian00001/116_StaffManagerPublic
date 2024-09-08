package com.rabbiter.staff.entity.vo;

import java.util.List;

public class UserInfoVo {
    private List<String> roles;//角色
    private String introduction;//介绍
    private String avatar; //头像
    private String name;//用户名

    public UserInfoVo() {
    }

    public UserInfoVo(List<String> roles, String introduction, String avatar, String name) {
        this.roles = roles;
        this.introduction = introduction;
        this.avatar = avatar;
        this.name = name;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "UserInfoVo{" +
                "roles=" + roles +
                ", introduction='" + introduction + '\'' +
                ", avatar='" + avatar + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
