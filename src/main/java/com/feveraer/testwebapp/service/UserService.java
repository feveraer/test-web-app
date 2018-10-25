package com.feveraer.testwebapp.service;

import com.feveraer.testwebapp.dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto getUserById(String id);
    void saveUser(UserDto userDto);
    List<UserDto> getAllUsers();
}
