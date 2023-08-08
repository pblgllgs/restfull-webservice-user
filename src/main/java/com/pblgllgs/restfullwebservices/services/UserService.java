package com.pblgllgs.restfullwebservices.services;

import com.pblgllgs.restfullwebservices.dto.UserDto;
import com.pblgllgs.restfullwebservices.entity.User;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto user);

    UserDto findUserById(Long id);

    List<UserDto> findAllUsers();

    UserDto updateUser(User user,Long id);

    void deleteUser(Long id);
}
