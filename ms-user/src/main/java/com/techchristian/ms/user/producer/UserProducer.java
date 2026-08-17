package com.techchristian.ms.user.producer;

import com.techchristian.ms.user.database.model.UserModel;
import com.techchristian.ms.user.dto.EmailCreateDto;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Component
@RequiredArgsConstructor
public class UserProducer {
    private final RabbitTemplate rabbitTemplate;

    @Value(value = "${broker.queue.email.welcome}")
    private String emailWelcome;

    public void sendWelcomeEmail(UserModel userModel){
        EmailCreateDto emailCreate = new EmailCreateDto();

        emailCreate.setUserId(userModel.getUserId());
        emailCreate.setEmailTo(userModel.getEmail());
        emailCreate.setSubject("Registration successful");
        emailCreate.setText(userModel.getName() + ", Welcome to the user!");

        rabbitTemplate.convertAndSend("", emailWelcome, emailCreate);
    }
}
