package com.example.kafka.dto;
import lombok.Data;
import java.util.Date;

@Data
public class ProfileLogDto {
    private String name;
    private int age;
    private Date createdAt;
}
