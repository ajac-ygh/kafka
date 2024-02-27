package com.example.kafka.listener;

import com.example.kafka.logic.ProfileLogic;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProfileListener {

    @Autowired
    private ProfileLogic logic;

    @KafkaListener(topics = "profile.created")
    public void listener(String data) throws JsonProcessingException {
        logic.createProfileLogic(data);
    }

}
