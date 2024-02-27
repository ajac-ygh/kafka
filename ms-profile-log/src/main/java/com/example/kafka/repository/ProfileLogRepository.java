package com.example.kafka.repository;

import com.example.kafka.entity.ProfileLogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProfileLogRepository extends JpaRepository<ProfileLogEntity, String> {
    
    @Query(value = "select * from profile_log", nativeQuery = true)
    List<ProfileLogEntity> listAllProfile();

}
