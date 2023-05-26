package ru.muhametshin.javaprecs.prac14.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import ru.muhametshin.javaprecs.prac14.models.Footballer;

import java.util.List;

@RestController
@RequestMapping("/f")
@RequiredArgsConstructor
public class FootballerController {

    private final Footballer footballer;

    @GetMapping()
    public List<Footballer> getF() {
        footballer.fillArray();
        return Footballer.getPeople();
    }

    @PostMapping("/add")
    public void addF(@RequestBody Footballer newFootballer) {
        footballer.addFootballertInlist(newFootballer);
    }

    @DeleteMapping("/delete/{name}")
    public void deleteF(@PathVariable("name") String name) {
        footballer.deleteFootballer(name);
    }

}
