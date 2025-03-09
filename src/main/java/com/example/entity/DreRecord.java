package com.example.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name = "dre_records")
public class DreRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @NotNull
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Column(name = "certification_date", nullable = false)
    private LocalDate certification_date;

    @Column(name = "status", nullable = false)
    private String status;

    public DreRecord() {
    }

    public DreRecord(int id, String name, LocalDate certification_date, String status) {
        this.id = id;
        this.name = name;
        this.certification_date = certification_date;
        this.status = status;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public LocalDate getCertification_date() {return certification_date;}

    public void setCertification_date(LocalDate certification_date) {
        this.certification_date = certification_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
