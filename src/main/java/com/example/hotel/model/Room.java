package com.example.hotel.model;

import com.example.hotel.enums.RoomStatus;
import com.example.hotel.enums.RoomType;
import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int floorNumber;
    private int roomNumber;
    @Enumerated(EnumType.STRING)
    private RoomStatus roomStatus;
    @Enumerated(EnumType.STRING)
    private RoomType roomType;
    private double price;
}
