package ru.muhametshin.javaprecs.prac14.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.NoArgsConstructor;
import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.muhametshin.javaprecs.prac14.models.Team;

import java.util.List;

@NoArgsConstructor
@Component
public class TeamDAO {

    @PersistenceContext
    private EntityManager em;

    public List<Team> findAll() {
        Session session = em.unwrap(Session.class);
        return session
                .createQuery("SELECT t from Team t", Team.class).getResultList();
    }

    @Transactional
    public void save(Team team) {
        Session session = em.unwrap(Session.class);
        session.persist(team);
        session.close();
    }

    @Transactional
    public void delete(String name) {
        Session session = em.unwrap(Session.class);

        String hql = ("From Team where name =: name");

        Object footballer = session.createQuery(hql).setParameter("name", name).getSingleResult();
        session.remove(footballer);

        session.close();
    }





}
