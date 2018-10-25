package com.feveraer.testwebapp.service;

import com.feveraer.testwebapp.dto.UserDto;
import com.feveraer.testwebapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto getUserById(String id) {
        return null;
    }

    @Override
    public void saveUser(UserDto userDto) {

    }

    @Override
    public List<UserDto> getAllUsers() {
        return null;
    }
}
