package ru.muhametshin.prac1_8.pr2;


import java.time.LocalDate;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class pr2 {
    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(
                new Human(21, "Samuel", "Adamson", LocalDate.of(2002,2,17), 80),
                new Human(20, "George", "Wilson", LocalDate.of(2003,1,23), 75),
                new Human(18, "Connor", "Ellington", LocalDate.of(1995,10,1), 91),
                new Human(25, "Emily", "Walker", LocalDate.of(1997,7,25), 68)
        );
        LocalDate date = LocalDate.of(2000, 1, 1);
        Stream<Human> stream = humans.stream();
        List<Integer> list = new LinkedList<>();
        stream.peek(h -> h.weight += 3).sorted().filter(h-> h.birthDate.compareTo(date) < 0).forEach(h -> list.add(h.weight));
        System.out.println(list.stream().parallel().reduce(0, (a, b) -> a + b));
    }
}
