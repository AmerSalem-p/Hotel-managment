package com.example.hotel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.util.Date;


@Data
@Entity
public class EmployeeWorkingDays {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private long id;

    private String dayOfWeek;

    @Temporal(TemporalType.TIME)
    private Date startTime;

    @Temporal(TemporalType.TIME)
    private Date endTime;

    @ManyToOne()
    @JoinColumn(name = "employee_id")
    private Employee employee;
}
