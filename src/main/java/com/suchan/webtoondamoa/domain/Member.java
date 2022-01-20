package com.suchan.webtoondamoa.domain;


import lombok.Data;

@Data
public class Member {

    private Long id;
    private String loginId;
    private String pw;
    private String name;
    private String email;

    public Member() {
    }

    public Member(String loginId, String pw, String name, String email) {
        this.loginId = loginId;
        this.pw = pw;
        this.name = name;
        this.email = email;
    }
}
