package com.techchristian.ms.user.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class EmailCreateDto {
    UUID userId;
    String emailTo;
    String subject;
    String text;
}
