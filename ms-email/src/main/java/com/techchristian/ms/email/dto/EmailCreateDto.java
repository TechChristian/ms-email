package com.techchristian.ms.email.dto;

import java.util.UUID;

public record EmailCreateDto (
        UUID userId,
        String emailFrom,
        String emailTo,
        String subject,
        String text
){ }
