package ru.muhametshin.javapracs.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.muhametshin.javapracs.models.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {

}
