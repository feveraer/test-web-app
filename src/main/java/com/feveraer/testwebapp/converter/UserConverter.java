package com.feveraer.testwebapp.converter;

import com.feveraer.testwebapp.dto.UserDto;
import com.feveraer.testwebapp.entity.User;

public class UserConverter {

    public static User dtoToEntity(UserDto userDto) {
        User user = new User(userDto.getUserName());
        user.setId(userDto.getId());
        return user;
    }

    public static UserDto entityToDto(User user) {
        return new UserDto(user.getId(), user.getUserName());
    }
}
