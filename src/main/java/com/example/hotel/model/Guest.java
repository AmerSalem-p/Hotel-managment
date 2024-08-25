package com.example.hotel.model;


import jakarta.persistence.Id;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@Entity
public class Guest extends User{



}
