package com.example.BookMyShow.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Actor extends  BaseModel{
    private String name;
}
