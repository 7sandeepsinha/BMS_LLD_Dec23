package dev.sandeep.BookMyShow.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity(name = "BMS_USER")
public class User extends BaseModel{
    private String name;

    @Column(unique = true)
    private String email;

    private String password;
    @OneToMany
    private List<Ticket> tickets;
}
