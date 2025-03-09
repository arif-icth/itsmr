package com.example.controller;
import jakarta.validation.Valid;
import com.example.entity.DreRecord;
import com.example.service.DREService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/dre")
@Validated
public class DREController {

    @Autowired
    private DREService service;

    @GetMapping
    public List<DreRecord> getAll() {
        return service.getAllDre();
    }

    @GetMapping("/{id}")
    public Optional<DreRecord> getById(@PathVariable Integer id) {
        return service.getDreById(id);
    }

    @PostMapping
    public DreRecord create(@Valid @RequestBody DreRecord record) {
        return service.saveDre(record);
    }

    @PutMapping("/{id}")
    public DreRecord update(@PathVariable Integer id, @Valid @RequestBody DreRecord record) {
        record.setId(id);
        return service.saveDre(record);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        service.deleteDreById(id);
    }

    @GetMapping("/filter")
    public List<DreRecord> filterByStatus(@RequestParam String status) {
        return service.filterDreByStatus(status);
    }

    @GetMapping("/search")
    public List<DreRecord> searchDreRecords(@RequestParam String name) {
        return service.searchDreRecords(name);
    }
}
