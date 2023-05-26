package ru.muhametshin.javaprecs.prac14.models;

import lombok.*;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Component
@NoArgsConstructor
public class Team {

    private String name;
    private String creationDate;

    private static List<Team> teams= new ArrayList<>();



    public void addTeamInList(Team team) {
        teams.add(team);
    }

    public void deleteTeam(String name) {
        teams.removeIf(team -> Objects.equals(team.getName(), name));
    }

    public void fillArray() {
        if (teams.size() == 0) {
            teams.add(new Team("MIREA", "01.02.1975"));
            teams.add(new Team("MGU", "03.08.1956"));
            teams.add(new Team("HSE", "11.11.1964"));
            teams.add(new Team("MFTI", "06.10.1970"));
        }
    }

    public Team(String name, String creationDate) {
        this.name = name;
        this.creationDate = creationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public static List<Team> getTeams() {
        return teams;
    }

}
