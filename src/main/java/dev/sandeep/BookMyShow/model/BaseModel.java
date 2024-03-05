package dev.sandeep.BookMyShow.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public abstract class BaseModel {
    @Id // tells that the attribute private int id is the primary key
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID")
    private int id; // primary key
    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private String createdBy;
    private String updatedBy;
}
