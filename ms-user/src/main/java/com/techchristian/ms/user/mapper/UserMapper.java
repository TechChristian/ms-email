package com.techchristian.ms.user.mapper;

import com.techchristian.ms.user.database.model.UserModel;
import com.techchristian.ms.user.dto.UserCreateDto;
import com.techchristian.ms.user.dto.UserResponseDto;

public class UserMapper {
    public static UserModel toEntity(UserCreateDto dto){
        return UserModel.builder()
                .email(dto.email())
                .name(dto.name())
                .build();
    }

    public static UserResponseDto toResponseDto(UserModel userModel){
        return new UserResponseDto(
                userModel.getUserId(),
                userModel.getEmail(),
                userModel.getName()
        );
    }
}
