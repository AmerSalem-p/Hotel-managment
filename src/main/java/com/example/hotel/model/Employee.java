package com.example.hotel.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Employee extends User{

    private String department;

    @OneToMany(mappedBy = "employee")
    private List<EmployeeWorkingDays> employeeWorkingDays;

}
