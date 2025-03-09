package com.example.repository;

import com.example.entity.DreRecord;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DRERepository extends JpaRepository<DreRecord, Integer> {
    List<DreRecord> findByNameContainingIgnoreCase(String name);
    List<DreRecord> findByStatus(String status);
}
