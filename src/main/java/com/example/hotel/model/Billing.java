package com.example.hotel.model;

import com.example.hotel.enums.PaymentStatus;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Billing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @OneToOne(mappedBy = "billing")
    private Reservation reservation;

    private double totalPrice;

    private PaymentStatus paymentStatus;
}
