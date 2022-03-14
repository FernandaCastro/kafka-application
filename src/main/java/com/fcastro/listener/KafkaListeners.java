package com.fcastro.listener;

import com.fcastro.message.Message;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class KafkaListeners {

    @KafkaListener(
        topics="fcastro",
        groupId = "groupId",
        containerFactory = "messageFactory"
    )

    void listener(Message message){
        System.out.println("Listener received: " + message + " 🎉");
    }
}
