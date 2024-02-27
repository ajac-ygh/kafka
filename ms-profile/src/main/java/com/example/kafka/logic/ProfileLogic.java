package com.example.kafka.logic;

import com.example.kafka.entity.ProfileEntity;
import com.example.kafka.repository.ProfileRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class ProfileLogic {

    @Autowired
    private ProfileRepository repository;

    @Autowired private ObjectMapper objectMapper;

    public void createProfileLogic(String data) throws JsonProcessingException {
        var entity = objectMapper.readValue(data, ProfileEntity.class);
        repository.createNewProfile(entity.getName(), entity.getAge());
        log.info("Saved {}", entity);
    }

}
