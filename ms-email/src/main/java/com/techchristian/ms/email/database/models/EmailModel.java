package com.techchristian.ms.email.database.models;

import com.techchristian.ms.email.database.enums.StatusEmail;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "TB_EMAILS")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class EmailModel implements Serializable {
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
