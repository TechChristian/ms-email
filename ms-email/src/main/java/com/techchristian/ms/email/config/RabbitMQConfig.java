package com.techchristian.ms.email.config;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMQConfig {

    @Value(value = "${broker.queue.email.welcome}")
    private String welcomeQueue;

    // * name queue
    @Bean
    public Queue emailQueue() {
        return new Queue(welcomeQueue, true);
    }

    // * convert messages (object) in Json
    public Jackson2JsonMessageConverter messageConverter() {
        return new Jackson2JsonMessageConverter();
    }
}
