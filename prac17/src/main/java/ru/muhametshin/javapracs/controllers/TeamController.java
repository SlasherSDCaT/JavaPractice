package ru.muhametshin.javapracs.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.muhametshin.javapracs.dao.TeamDAO;
import ru.muhametshin.javapracs.models.Team;
import ru.muhametshin.javapracs.service.TeamService;

import java.util.List;

@RestController
@RequestMapping("/t")
@RequiredArgsConstructor
public class TeamController {

    private final TeamDAO dao;
    private final TeamService teamService;

    @GetMapping()
    public List<Team> getF() {
        return dao.findAll();
    }

    @PostMapping("/add")
    public void addF(@RequestBody Team team) {
        dao.save(team);
    }

    @DeleteMapping("/delete/{name}")
    public void deleteF(@PathVariable("name") String name) {
        dao.delete(name);
    }

    @GetMapping("/sort_by_name")
    public List<Team> sortByName() {
        return teamService.sortByName();
    }

}
