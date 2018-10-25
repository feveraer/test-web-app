package com.feveraer.testwebapp.converter;

import com.feveraer.testwebapp.dto.SkillDto;
import com.feveraer.testwebapp.entity.Skill;

public class SkillConverter {

    public static Skill dtoToEntity(SkillDto skillDto) {
        Skill skill = new Skill(skillDto.getSkillName(), null);
        skill.setId(skillDto.getId());
        return skill;
    }

    public static SkillDto entityToDto(Skill skill) {
        return new SkillDto(skill.getId(), skill.getSkillName());
    }
}
