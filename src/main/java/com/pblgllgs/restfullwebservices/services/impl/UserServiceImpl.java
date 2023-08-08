package com.pblgllgs.restfullwebservices.services.impl;

import com.pblgllgs.restfullwebservices.dto.UserDto;
import com.pblgllgs.restfullwebservices.entity.User;
import com.pblgllgs.restfullwebservices.mapper.UserMapper;
import com.pblgllgs.restfullwebservices.repository.UserRepository;
import com.pblgllgs.restfullwebservices.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = UserMapper.mapUserDtoToUser(userDto);
        User userSaved = userRepository.save(user);
        return UserMapper.mapUserToUserDto(userSaved);
    }

    @Override
    public UserDto findUserById(Long id) {
        User userDb = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found"));
        return UserMapper.mapUserToUserDto(userDb);
    }

    @Override
    public List<UserDto> findAllUsers() {
        return userRepository
                .findAll()
                .stream()
                .map(UserMapper::mapUserToUserDto)
                .toList();
    }

    @Override
    public UserDto updateUser(User user, Long id) {
        UserDto userDto = this.findUserById(id);
        userDto.setEmail(user.getEmail());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        User userUpdated = UserMapper.mapUserDtoToUser(userDto);
        User userSaved = userRepository.save(userUpdated);
        return UserMapper.mapUserToUserDto(userSaved);
    }

    @Override
    public void deleteUser(Long id) {
        UserDto userDto = this.findUserById(id);
        if (userDto != null) {
            userRepository.deleteById(id);
        }
    }
}
