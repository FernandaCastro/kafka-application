package com.fcastro.listener;

import com.fcastro.message.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
        topics="message-topic",
        groupId = "groupId",
        containerFactory = "messageFactory"
    )

    void listener(Message message){
        String processed = "Listener received: " + message;
        System.out.println(processed);
    }
}
