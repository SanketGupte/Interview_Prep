package com.sanket.spring_boot_kafka_example.services;

import org.apache.kafka.common.protocol.types.Field;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {
    private static final String TOPIC = "my_topic";
    private final KafkaTemplate<String, String> kafkaTemplate;

    public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }
    public void sendMessage(String message) {
        kafkaTemplate.send(TOPIC, message);
        System.out.println("Message sent: " + message);
    }
}
