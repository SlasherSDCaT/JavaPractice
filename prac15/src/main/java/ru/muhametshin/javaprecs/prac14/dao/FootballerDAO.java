package ru.muhametshin.javaprecs.prac14.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.NoArgsConstructor;
import org.hibernate.Session;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import ru.muhametshin.javaprecs.prac14.models.Footballer;

import java.util.List;

@NoArgsConstructor
@Component
public class FootballerDAO {

    @PersistenceContext
    private EntityManager em;

    public List<Footballer> findAll() {
        Session session = em.unwrap(Session.class);
        return session
                .createQuery("SELECT f from Footballer f", Footballer.class).getResultList();
    }

    @Transactional
    public void save(Footballer footballer) {
        Session session = em.unwrap(Session.class);
        session.persist(footballer);
        session.close();
    }

    @Transactional
    public void delete(String name) {
        Session session = em.unwrap(Session.class);

        String hql = ("From Footballer where firstName =: name");

        Object footballer = session.createQuery(hql).setParameter("name", name).getSingleResult();
        session.remove(footballer);

        session.close();
    }





}
