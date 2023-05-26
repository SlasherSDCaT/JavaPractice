package ru.muhametshin.javaprecs.prac14.controllers;

import org.springframework.web.bind.annotation.*;
import ru.muhametshin.javaprecs.prac14.dao.FootballerDAO;
import ru.muhametshin.javaprecs.prac14.models.Footballer;

import java.util.List;

@RestController
@RequestMapping("/f")
public class FootballerController {

    private final FootballerDAO dao;

    public FootballerController(FootballerDAO dao) {
        this.dao = dao;
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

}
