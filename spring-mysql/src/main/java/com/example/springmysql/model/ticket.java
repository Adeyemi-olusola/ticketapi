package com.example.springmysql.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Ticket")
public class ticket {
    @Id
    @GeneratedValue()


    private int id;
    private double amount;
    private String category;

    
}
