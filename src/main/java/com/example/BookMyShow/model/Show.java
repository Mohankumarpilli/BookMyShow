package com.example.BookMyShow.model;

import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ManyToAny;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
public class Show extends  BaseModel{
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @ManyToOne
    private  Movie movie;
    @ManyToOne
    private Auditorium auditorium;
    @OneToMany
    private List<ShowSeat> showSeat;
}
