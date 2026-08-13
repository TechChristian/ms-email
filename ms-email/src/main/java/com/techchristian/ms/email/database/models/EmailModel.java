package com.techchristian.ms.email.database.models;

import com.techchristian.ms.email.database.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_EMAILS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class EmailModel {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID emailId;
    private UUID userId;
    private String emailFrom;
    private String emailTo;
    private String subject;
    @Column(columnDefinition = "TEXT")
    private String text;
    private LocalDateTime sentDateEmail;
    private StatusEmail statusEmail;
}
