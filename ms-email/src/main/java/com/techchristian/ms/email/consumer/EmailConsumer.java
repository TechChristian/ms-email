package com.techchristian.ms.email.consumer;

import com.techchristian.ms.email.database.models.EmailModel;
import com.techchristian.ms.email.dto.EmailCreateDto;
import com.techchristian.ms.email.service.EmailService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.BeanUtils;

@RequiredArgsConstructor
public class EmailConsumer {

    private final EmailService emailService;

    @RabbitListener(queues = "${broker.queue.email.welcome}")
    public void receiveEmailWelcome(EmailCreateDto emailCreateDto) {
        EmailModel emailModel = new EmailModel();
        BeanUtils.copyProperties(emailCreateDto, emailModel);

        // * sendEmail
        emailService.sendEmail(emailModel);
    }
}
