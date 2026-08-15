package com.techchristian.ms.email.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.util.UUID;

public record EmailCreateDto (
        @NotNull
        UUID userId,
        @Email(message = "invalid email from.")
        @NotBlank(message = "email from is required.")
        String emailFrom,
        @Email(message = "invalid email to")
        @NotBlank(message = "email to is required.")
        String emailTo,
        @NotBlank(message = "subject is required.")
        String subject,
        @NotBlank(message = "text is required")
        String text
){ }
