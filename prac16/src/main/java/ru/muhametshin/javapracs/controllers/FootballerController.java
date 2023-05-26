package ru.muhametshin.javapracs.controllers;

import org.springframework.web.bind.annotation.*;
import ru.muhametshin.javapracs.dao.FootballerDAO;
import ru.muhametshin.javapracs.models.Footballer;
import ru.muhametshin.javapracs.models.Team;
import ru.muhametshin.javapracs.service.FootballerService;

import java.util.List;

@RestController
@RequestMapping("/f")
public class FootballerController {

    private final FootballerDAO dao;
    private final FootballerService footballerService;

    public FootballerController(FootballerDAO dao, FootballerService footballerService) {
        this.dao = dao;
        this.footballerService = footballerService;
    }

    @GetMapping()
    public List<Footballer> getF() {
       return dao.findAll();
    }

    @PostMapping("/add")
    public void addF(@RequestBody Footballer newFootballer) {
        dao.save(newFootballer);
    }

    @DeleteMapping("/delete/{name}")
    public void deleteF(@PathVariable("name") String name) {
        dao.delete(name);
    }

    @GetMapping("/{footId}/team")
    public Team getFootTeam(@PathVariable("footId") int footId) {
        return footballerService.getTeamByFoot(footId);
    }

}
