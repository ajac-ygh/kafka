package com.example.kafka.logic;

import com.example.kafka.entity.ProfileLogEntity;
import com.example.kafka.repository.ProfileLogRepository;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@Slf4j
public class ProfileLogLogic {

    @Autowired private ProfileLogRepository repository;

    @Autowired private ObjectMapper objectMapper;

    public void createProfileLogLogic(String data) throws JsonProcessingException {
        var entity = objectMapper.readValue(data, ProfileLogEntity.class);
        entity.setCreatedAt(new Date());
        var result = repository.save(entity);
        log.info("Saved {}", result);
    }

}
