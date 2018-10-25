package com.feveraer.testwebapp.dto;

import java.util.ArrayList;
import java.util.List;

public class UserDto {
    private String id;
    private String userName;

    // LinkedList not needed in the DTO, no operations happen on this list
    private List<SkillDto> skillDtos = new ArrayList<>();

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

    public List<SkillDto> getSkillDtos() {
        return skillDtos;
    }

    public void setSkillDtos(List<SkillDto> skillDtos) {
        this.skillDtos = skillDtos;
    }

    // hibernate needs default constructor
    protected UserDto() {}

    public UserDto(String id, String userName, List<SkillDto> skillDtos) {
        this.id = id;
        this.userName = userName;
        this.skillDtos = skillDtos;
    }
}
