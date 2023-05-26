package ru.muhametshin.javapracs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import ru.muhametshin.javapracs.models.Footballer;
import ru.muhametshin.javapracs.models.Team;

@Service
public class EmailService {

    @Autowired
    public JavaMailSender emailSender;

    @Async
    public void sendAddFootballerEmail(Footballer footballer){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("domashki.netu@gmail.com");
        message.setTo("slashersdcat@gmail.com");
        message.setSubject("Message from Spring Boot Application");
        message.setText(footballer.toString());

        emailSender.send(message);
        System.out.println("Email successfully sent!");
    }

    @Async
    public void sendAddTeamEmail(Team team){
        SimpleMailMessage message = new SimpleMailMessage();

        message.setFrom("domashki.netu@gmail.com");
        message.setTo("slashersdcat@gmail.com");
        message.setSubject("Message from Spring Boot Application");
        message.setText(team.toString());

        emailSender.send(message);
        System.out.println("Email successfully sent!");
    }
}