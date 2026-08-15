package com.techchristian.ms.user.dto;

import java.util.UUID;

public record UserResponseDto(
        UUID userId,
        String email,
        String name
) { }
