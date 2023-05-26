package ru.muhametshin.javapracs.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.muhametshin.javapracs.models.Footballer;
import ru.muhametshin.javapracs.models.Team;
import ru.muhametshin.javapracs.service.FootballerService;

import java.util.List;


@RestController
@RequestMapping("/f")
@RequiredArgsConstructor
public class FootballerController {

    private final FootballerService footballerService;

    @GetMapping()
    public List<Footballer> getF() {
        return footballerService.findAll();
    }

    @PostMapping("/add")
    public void addF(@RequestBody Footballer newFootballer) {
        footballerService.create(newFootballer);
    }

    @DeleteMapping("/delete/{name}")
    public void deleteF(@PathVariable("name") int id) {
        footballerService.delete(id);
    }

    @GetMapping("/{footId}/team")
    public Team getFootTeam(@PathVariable("footId") int footId) {
        return footballerService.getTeamByFoot(footId);
    }

    @GetMapping("/sort_by_firstname")
    public List<Footballer> sortFootByFirstName() {
        return footballerService.sortFootByFirstName();
    }

    @GetMapping("/sort_by_lastname")
    public List<Footballer> sortFootByLastName() {
        return footballerService.sortFootByLastName();
    }

}
