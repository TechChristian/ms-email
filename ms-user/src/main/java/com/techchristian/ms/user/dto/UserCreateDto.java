package com.techchristian.ms.user.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UserCreateDto(
        @Email
        @NotBlank(message = "email is required.")
        String email,
        @NotBlank(message = "name is required.")
        String name
) {}
