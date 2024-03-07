package dev.sandeep.BookMyShow.model;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Show extends BaseModel{
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Auditorium auditorium;
    @OneToMany
    private List<ShowSeat> showSeat; // TBD
}
/*
    Show        Movie
    1           1
    M           1

    M           1 -> ManyToOne

    Show        Auditorium
    1           1
    M           1

    M           1 -> ManyToOne
 */