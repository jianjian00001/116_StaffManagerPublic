package com.rabbiter.staff.entity.vo;


public class TokenVo {
    private String token;

    public TokenVo() {
    }

    public TokenVo(String token) {
        this.token = token;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "TokenVo{" +
                "token='" + token + '\'' +
                '}';
    }
}
