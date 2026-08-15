package com.techchristian.ms.user.service;

import com.techchristian.ms.user.database.model.UserModel;
import com.techchristian.ms.user.database.repository.UserRepository;
import com.techchristian.ms.user.dto.UserCreateDto;
import com.techchristian.ms.user.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    @Transactional
    public UserModel addUser(UserCreateDto dto) {
        UserModel userRequestToEntity = UserMapper.toEntity(dto);
        return userRepository.save(userRequestToEntity);
    }
}
