package com.example.springKafkaConsumer.listener;

import com.example.springKafkaConsumer.domain.User;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaConsumer {

    @KafkaListener(topics = "kafka_Example", groupId = "group_Id")
    public void consumer(String message){
        System.out.println("Consumed message: "+message);

    }

    @KafkaListener(topics = "kafka_Example_json", groupId = "group_json",
            containerFactory = "userKafkaListenerFactory")
    public void consumerJson(User user){
        System.out.println("Consumed JSON Message: "+user);
    }

}
