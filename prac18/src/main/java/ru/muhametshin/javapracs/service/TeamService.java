package ru.muhametshin.javapracs.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import ru.muhametshin.javapracs.models.Team;
import ru.muhametshin.javapracs.repositories.TeamRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TeamService {

    private final TeamRepository teamRepository;

    public Team create(Team team) {
        return teamRepository.save(team);
    }

    public List<Team> findAll() {
        return teamRepository.findAll();
    }

    public void delete(int id) {
        teamRepository.deleteById(id);
    }

    @PersistenceContext
    private EntityManager em;

    public List<Team> sortByName() {
        Session session = em.unwrap(Session.class);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Team> teamCriteriaQuery = builder.createQuery(Team.class);
        Root<Team> root = teamCriteriaQuery.from(Team.class);

        teamCriteriaQuery.select(root).orderBy(builder.asc(root.get("name")));
        return session.createQuery(teamCriteriaQuery).getResultList();
    }

}
