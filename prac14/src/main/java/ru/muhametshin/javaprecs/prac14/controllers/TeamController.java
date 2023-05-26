package ru.muhametshin.javaprecs.prac14.controllers;

import org.springframework.web.bind.annotation.*;
import ru.muhametshin.javaprecs.prac14.models.Team;

import java.util.List;

@RestController
@RequestMapping("/t")
public class TeamController {

    private final Team team;

    public TeamController(Team team) {
        this.team = team;
    }

    @GetMapping()
    public List<Team> getF() {
        team.fillArray();
        return Team.getTeams();
    }

    @PostMapping("/add")
    public void addF(@RequestBody Team team) {
        team.addTeamInList(team);
    }

    @DeleteMapping("/delete/{name}")
    public void deleteF(@PathVariable("name") String name) {
        team.deleteTeam(name);
    }

}
