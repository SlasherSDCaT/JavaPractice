package ru.muhametshin.javaprecs.prac14.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "footballer")
@Getter
@Setter
@NoArgsConstructor
public class Footballer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    public Footballer(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

}
