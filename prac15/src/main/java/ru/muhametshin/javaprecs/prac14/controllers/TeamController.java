package ru.muhametshin.javaprecs.prac14.controllers;

import org.springframework.web.bind.annotation.*;
import ru.muhametshin.javaprecs.prac14.dao.TeamDAO;
import ru.muhametshin.javaprecs.prac14.models.Team;

import java.util.List;

@RestController
@RequestMapping("/t")
public class TeamController {

    private final TeamDAO dao;

    public TeamController(TeamDAO dao) {
        this.dao = dao;
    }

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
}
