package com.example.kafka.controller;

import com.example.kafka.dto.ProfileDto;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("api/v1/profile/")
@RestController
public class ProfileController {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    private ObjectMapper objectMapper;

    @PostMapping("create/")
    public String createProfile(@RequestBody ProfileDto profileDto) throws JsonProcessingException {
        kafkaTemplate.send("profile.created", objectMapper.writeValueAsString(profileDto));
        return "CREATED";
    }

}
