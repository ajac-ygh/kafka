package com.example.kafka.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
@Entity(name = "profile")
@Data
public class ProfileEntity {
    @Id
    private String name;
    private int age;
}
