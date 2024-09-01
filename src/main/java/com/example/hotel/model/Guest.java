package com.example.hotel.model;


import jakarta.persistence.Entity;
import lombok.Data;


@Data
@Entity
public class Guest extends User{
    private int reservationPoints;
}
