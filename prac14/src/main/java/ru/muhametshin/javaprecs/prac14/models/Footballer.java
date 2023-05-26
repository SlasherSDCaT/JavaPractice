package ru.muhametshin.javaprecs.prac14.models;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
@NoArgsConstructor
@Getter
@Setter
@ToString
public class Footballer {

    private String firstName;
    private String lastName;

    private static List<Footballer> people = new ArrayList<>();

    public Footballer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void addFootballertInlist(Footballer footballer) {
        people.add(footballer);
    }

    public void deleteFootballer(String firstName) {
        people.removeIf(footballer -> Objects.equals(footballer.getFirstName(), firstName));
    }

    public void fillArray() {
        if (people.size() == 0) {
            people.add(new Footballer("Tom", "Johnson"));
            people.add(new Footballer("Katy", "Lambda"));
            people.add(new Footballer("Man", "Johnson"));
            people.add(new Footballer("Danil", "Matrosov"));
        }
    }

    public static List<Footballer> getPeople() {
        return people;
    }

}
