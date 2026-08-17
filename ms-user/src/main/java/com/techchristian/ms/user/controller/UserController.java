package com.techchristian.ms.user.controller;

import com.techchristian.ms.user.database.model.UserModel;
import com.techchristian.ms.user.dto.UserCreateDto;
import com.techchristian.ms.user.dto.UserResponseDto;
import com.techchristian.ms.user.mapper.UserMapper;
import com.techchristian.ms.user.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("v1/api/users")
public class UserController {
    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserResponseDto> createUser (@RequestBody @Valid UserCreateDto dto){
        UserModel user = userService.addUser(dto);

        UserResponseDto response = UserMapper.toResponseDto(user);

        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
