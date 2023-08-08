package com.pblgllgs.restfullwebservices.mapper;

import com.pblgllgs.restfullwebservices.dto.UserDto;
import com.pblgllgs.restfullwebservices.entity.User;

public class UserMapper {
    public static UserDto mapUserToUserDto(User user) {
        return UserDto.builder()
                .id(user.getId())
                .firstName(user.getFirstName())
                .lastName(user.getLastName())
                .email(user.getEmail())
                .build();
    }

    public static User mapUserDtoToUser(UserDto userDto) {
        return User.builder()
                .id(userDto.getId())
                .firstName(userDto.getFirstName())
                .lastName(userDto.getLastName())
                .email(userDto.getEmail())
                .build();
    }

}
