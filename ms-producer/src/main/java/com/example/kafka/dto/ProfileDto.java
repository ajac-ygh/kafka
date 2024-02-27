package com.example.kafka.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProfileDto implements Serializable {
    private String name;
    private int age;
}
