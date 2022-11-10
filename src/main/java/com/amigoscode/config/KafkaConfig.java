package com.amigoscode.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * Class responsible for creating our topics
 */
@Configuration
public class KafkaConfig {

    // bean annotation so this get instantiated -> we tell Spring that he should manage this method
    @Bean
    public NewTopic amigoscodeTopic(){
        return TopicBuilder.name("amigoscode")
                .build();
    }
}
