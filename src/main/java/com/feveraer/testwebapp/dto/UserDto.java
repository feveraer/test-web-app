package com.feveraer.testwebapp.dto;

public class UserDto {
    private String id;
    private String userName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    // hibernate needs default constructor
    protected UserDto() {}

    public UserDto(String id, String userName) {
        this.id = id;
        this.userName = userName;
    }
}
