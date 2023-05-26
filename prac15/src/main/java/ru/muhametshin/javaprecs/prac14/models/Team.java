package ru.muhametshin.javaprecs.prac14.models;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;

@Component
@Entity
@Getter
@Setter
@Table(name = "team")
@NoArgsConstructor
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "creation_data")
    private String creationDate;

    public Team(String name, String creationDate) {
        this.name = name;
        this.creationDate = creationDate;
    }
}
