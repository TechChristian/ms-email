package com.techchristian.ms.user.database.repository;

import com.techchristian.ms.user.database.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<UserModel, UUID> {
}
