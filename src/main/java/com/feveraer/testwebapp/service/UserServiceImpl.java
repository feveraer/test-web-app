package com.feveraer.testwebapp.service;

import com.feveraer.testwebapp.converter.UserConverter;
import com.feveraer.testwebapp.dto.UserDto;
import com.feveraer.testwebapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDto getUserById(String id) {
        return UserConverter.entityToDto(userRepository.getOne(id));
    }

    @Override
    public void saveUser(UserDto userDto) {
        userRepository.save(UserConverter.dtoToEntity(userDto));
    }

    @Override
    public List<UserDto> getAllUsers() {
        return userRepository.findAll().stream()
                .map(UserConverter::entityToDto)
                .collect(Collectors.toList());
    }
}
