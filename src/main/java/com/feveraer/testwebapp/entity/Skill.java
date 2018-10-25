package com.feveraer.testwebapp.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Skill {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name= "uuid", strategy= "uuid2")
    private String id;

    @Column(name = "skill_name")
    @NotNull
    private String skillName;

    @ManyToOne
    private User user;

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    // Hibernate needs default constructor
    protected Skill() {}

    public Skill(@NotNull String skillName, User user) {
        this.skillName = skillName;
        this.user = user;
    }
}
