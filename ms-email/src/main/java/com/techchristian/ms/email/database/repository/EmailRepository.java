package com.techchristian.ms.email.database.repository;

import com.techchristian.ms.email.database.models.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepository extends JpaRepository<EmailModel, UUID > {
}
