package ru.muhametshin.javapracs.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.muhametshin.javapracs.models.Team;
import ru.muhametshin.javapracs.service.EmailService;
import ru.muhametshin.javapracs.service.TeamService;

import java.util.List;

@RestController
@RequestMapping("/t")
@RequiredArgsConstructor
public class TeamController {

    private final TeamService teamService;
    private final EmailService emailService;

    @GetMapping()
    public List<Team> getF() {
        return teamService.findAll();
    }

    @PostMapping("/add")
    public void addF(@RequestBody Team team) {
        teamService.create(team);
        emailService.sendAddTeamEmail(team);

    }

    @DeleteMapping("/delete/{id}")
    public void deleteF(@PathVariable("id") int id) {
        teamService.delete(id);
    }

    @GetMapping("/sort_by_name")
    public List<Team> sortByName() {
        return teamService.sortByName();
    }

}
