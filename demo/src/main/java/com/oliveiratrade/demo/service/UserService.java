package com.oliveiratrade.demo.service;

import com.oliveiratrade.demo.dto.UserDto;
import com.oliveiratrade.demo.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);

    User findByEmail(String email);

    List<UserDto> findAllUsers();
}