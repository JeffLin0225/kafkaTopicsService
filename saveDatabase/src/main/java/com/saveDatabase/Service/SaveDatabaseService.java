package com.saveDatabase.Service;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class SaveDatabaseService {
    
    @KafkaListener(topics = "savedb-topic", groupId = "my-group")
    public void listen(String message) {
        System.out.println("Received message: " + message);
    }   
}

