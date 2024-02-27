package com.example.kafka.repository;

import com.example.kafka.entity.ProfileEntity;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ProfileRepository extends JpaRepository<ProfileEntity, String> {

    @Modifying
    @Transactional
    @Query(value = "insert into profile (name, age) values (:name, :age)", nativeQuery = true)
    void createNewProfile(@Param("name") String name, @Param("age") Integer age);

}
