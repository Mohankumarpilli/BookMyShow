package com.example.BookMyShow.model;

import com.example.BookMyShow.model.constant.PaymentMode;
import com.example.BookMyShow.model.constant.PaymentStatus;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PostRemove;

import java.time.LocalDateTime;

public class Payment extends BaseModel{
    private LocalDateTime paymentTime;
    private double amount;
    private String referenceId;
    @ManyToOne
    private Ticket ticket;
    @Enumerated(EnumType.STRING)
    private PaymentStatus paymentStatus;
    @Enumerated(EnumType.STRING)
    private PaymentMode paymentMode;
}
