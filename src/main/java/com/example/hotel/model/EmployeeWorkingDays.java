package com.example.hotel.model;

import jakarta.persistence.*;
import lombok.Data;

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
