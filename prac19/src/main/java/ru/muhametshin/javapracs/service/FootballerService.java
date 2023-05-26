package ru.muhametshin.javapracs.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import ru.muhametshin.javapracs.models.Footballer;
import ru.muhametshin.javapracs.models.Team;
import ru.muhametshin.javapracs.repositories.FootballerRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class FootballerService {

    private final FootballerRepository footballerRepository;

    public Footballer create(Footballer footballer) {
        return footballerRepository.save(footballer);
    }

    public List<Footballer> findAll() {
        return footballerRepository.findAll();
    }

    public void delete(int id) {
        footballerRepository.deleteById(id);
    }

    @PersistenceContext
    private EntityManager em;

    public Team getTeamByFoot(int footId) {
        Session session = em.unwrap(Session.class);
        return session.createQuery("From Footballer where id =: footId", Footballer.class)
                .setParameter("footId", footId).getSingleResult().getTeam();
    }

    public List<Footballer> sortFootByFirstName() {
        Session session = em.unwrap(Session.class);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Footballer> footCriteriaQuery = builder.createQuery(Footballer.class);
        Root<Footballer> root = footCriteriaQuery.from(Footballer.class);

        footCriteriaQuery.select(root).orderBy(builder.asc(root.get("firstName")));
        return session.createQuery(footCriteriaQuery).getResultList();
    }

    public List<Footballer> sortFootByLastName() {
        Session session = em.unwrap(Session.class);

        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Footballer> footCriteriaQuery = builder.createQuery(Footballer.class);
        Root<Footballer> root = footCriteriaQuery.from(Footballer.class);

        footCriteriaQuery.select(root).orderBy(builder.asc(root.get("lastName")));
        return session.createQuery(footCriteriaQuery).getResultList();
    }
}
