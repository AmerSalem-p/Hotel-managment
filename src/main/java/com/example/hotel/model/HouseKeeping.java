package com.example.hotel.model;


import com.example.hotel.enums.HouseKeepingStatus;
import jakarta.persistence.*;

@Entity
public class HouseKeeping {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String task;

    @ManyToOne
    private Room room;

    @ManyToOne
    private Employee employee;

    @Enumerated(EnumType.STRING)
    private HouseKeepingStatus houseKeepingStatus;
}
