package com.example.BookMyShow.model;

import com.example.BookMyShow.model.constant.SeatStatus;
import com.example.BookMyShow.model.constant.SeatType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private int row;
    private int col;
    private String seatNumber;
    @Enumerated(EnumType.STRING)
    private SeatType seatType;
    @Enumerated(EnumType.STRING)
    private SeatStatus status;
}
