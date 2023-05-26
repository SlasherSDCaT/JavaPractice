package ru.muhametshin.javapracs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.muhametshin.javapracs.models.Footballer;


@Repository
public interface FootballerRepository extends JpaRepository<Footballer, Integer> {
}
