package com.amigoscode;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * Here we say what we want to do with the data once we consumed it
 */
@Component
public class KafkaListeners {

    // as you have more listener you would want to change the groupdId to something more unique
    @KafkaListener(topics = "amigoscode", groupId = "groupId")
    void listener(String data){
        System.out.println("Listener received: " + data );
    }
}
