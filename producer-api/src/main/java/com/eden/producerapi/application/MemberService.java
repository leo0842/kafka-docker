package com.eden.producerapi.application;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    private final KafkaTemplate<String, String> kafkaTemplate;

    public MemberService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void createMember(MemberCreateRequest request) {
        kafkaTemplate.send("test", request.getEmail());
    }
}
