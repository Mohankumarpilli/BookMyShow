package com.example.BookMyShow.model;

import com.example.BookMyShow.model.constant.TicketStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel{
    private LocalDateTime timeOfBooking;
    private double totalAmount;
    @OneToMany
    private List<ShowSeat> showSeats;
    @ManyToOne
    private Show show;
    @Enumerated(EnumType.STRING)
    private TicketStatus ticketStatus;
}
