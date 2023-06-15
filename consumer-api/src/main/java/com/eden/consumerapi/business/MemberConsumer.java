package com.eden.consumerapi.business;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MemberConsumer {

    @KafkaListener(
            id = "eden",
            topics = "test",
            clientIdPrefix = "clientId",
            properties = {"enable.auto.commit:false", "auto.offset.reset:latest"}
    )
    public void listen(String data) {
        System.out.println("Consumed data : " + data);
    }
}
