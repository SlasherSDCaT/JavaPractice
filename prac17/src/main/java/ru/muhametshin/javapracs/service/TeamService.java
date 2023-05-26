package ru.muhametshin.javapracs.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import ru.muhametshin.javapracs.models.Team;

import java.util.List;

@Service

public class TeamService {

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
