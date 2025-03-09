package com.example.service;

import com.example.entity.DreRecord;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

public interface DREService {
    List<DreRecord> getAllDre();
    Optional<DreRecord> getDreById(Integer id);
    DreRecord saveDre(DreRecord record);
    void deleteDreById(Integer id);
    List<DreRecord> filterDreByStatus(String status);
    List<DreRecord> searchDreRecords(String name);

}
