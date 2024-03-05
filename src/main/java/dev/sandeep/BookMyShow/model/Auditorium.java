package dev.sandeep.BookMyShow.model;

import dev.sandeep.BookMyShow.model.constant.AuditoriumFeature;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
@Entity
public class Auditorium extends BaseModel{
    private String name;
    private int capacity;
    @OneToMany
    private List<Show> shows;
    @OneToMany
    private List<Seat> seats;
    @ElementCollection // used when Enum is in multiple, ie, a datastructure ex - List, Set etc.
    @Enumerated(EnumType.STRING) // creates a relationship between the entity class and the enum in DB
    private List<AuditoriumFeature> auditoriumFeatures;
}
