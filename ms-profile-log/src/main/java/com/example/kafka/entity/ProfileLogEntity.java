package com.example.kafka.entity;
import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Entity(name = "profile_log")
@Data
public class ProfileLogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private int age;
    private Date createdAt;
}
