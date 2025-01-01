package com.emailMaker.Service;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;
@Service
public class EmailMakerService {
    
    @KafkaListener(topics = "emailmaker-topic", groupId = "my-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }
}


