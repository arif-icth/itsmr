package com.example.service;

import com.example.entity.DreRecord;
import com.example.repository.DRERepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DREServiceImpl implements DREService {

   @Autowired
    private DRERepository repository;

    public List<DreRecord> getAllDre() {
        return repository.findAll();
    }

    public Optional<DreRecord> getDreById(Integer id) {
        return repository.findById(id);
    }

    public DreRecord saveDre(DreRecord record) {
        return repository.save(record);
    }

    public void deleteDreById(Integer id) {
        repository.deleteById(id);
    }

    public List<DreRecord> filterDreByStatus(String status) {
        return repository.findByStatus(status);
    }

    public List<DreRecord> searchDreRecords(String name) {
        return repository.findByNameContainingIgnoreCase(name);
    }

}
