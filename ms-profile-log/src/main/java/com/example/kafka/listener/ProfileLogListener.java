package com.example.kafka.listener;

import com.example.kafka.logic.ProfileLogLogic;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProfileLogListener {

    @Autowired
    private ProfileLogLogic profileLogLogic;

    @KafkaListener(topics = "profile.created")
    public void listener(String data) throws JsonProcessingException {
        profileLogLogic.createProfileLogLogic(data);
    }

}
