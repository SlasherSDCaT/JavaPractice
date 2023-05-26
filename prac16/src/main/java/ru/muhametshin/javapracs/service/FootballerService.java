package ru.muhametshin.javapracs.service;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.springframework.stereotype.Service;
import ru.muhametshin.javapracs.models.Footballer;
import ru.muhametshin.javapracs.models.Team;

@Service
@RequiredArgsConstructor
public class FootballerService {

    @PersistenceContext
    private EntityManager em;

    public Team getTeamByFoot(int footId) {
        Session session = em.unwrap(Session.class);
        return session.createQuery("From Footballer where id =: footId", Footballer.class)
                .setParameter("footId", footId).getSingleResult().getTeam();
    }
}
