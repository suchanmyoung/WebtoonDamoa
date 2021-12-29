package com.suchan.webtoondamoa.domain;


//@Entity
public class Member {

    private String id;
    private String pw;
    private String name;
    private String email;
    // email의 정규표현식 == \w+@\w+\.\w+(\.\w+)?


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
