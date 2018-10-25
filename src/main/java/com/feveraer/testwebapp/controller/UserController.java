package com.feveraer.testwebapp.controller;

import com.feveraer.testwebapp.dto.UserDto;
import com.feveraer.testwebapp.service.UserService;
import com.feveraer.testwebapp.utils.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(Constants.GET_USER_BY_ID)
    public UserDto getUserById(@PathVariable String id) {
        return userService.getUserById(id);
    }

    @RequestMapping(Constants.GET_ALL_USERS)
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @RequestMapping(value = Constants.SAVE_USER, method = RequestMethod.POST)
    public void saveUser(@RequestBody UserDto userDto) {
        userService.saveUser(userDto);
    }
}
