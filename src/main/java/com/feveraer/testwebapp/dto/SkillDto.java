package com.feveraer.testwebapp.dto;

public class SkillDto {

    private String id;
    private String skillName;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    // Hibernate needs default constructor
    protected SkillDto() {}

    public SkillDto(String id, String skillName) {
        this.id = id;
        this.skillName = skillName;
    }
}
