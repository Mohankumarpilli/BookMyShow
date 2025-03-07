package com.example.BookMyShow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Actor extends  BaseModel{
    private String name;
    @ManyToOne
    private List<Movie> movies;
}
