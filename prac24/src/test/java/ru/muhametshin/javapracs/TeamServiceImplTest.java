package ru.muhametshin.javapracs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import ru.muhametshin.javapracs.models.Team;
import ru.muhametshin.javapracs.repositories.TeamRepository;
import ru.muhametshin.javapracs.service.TeamService;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class TeamServiceImplTest {

    @Mock
    private TeamRepository teamRepository;

    @Captor
    ArgumentCaptor<Team> captor;

    @Test
    void getTeam() {

        Team student = new Team();
        student.setName("MIREA");

        Team student2 = new Team();
        student2.setName("MGU");

        Mockito.when(teamRepository.findAll()).thenReturn(List.of(student, student2));

        TeamService teamService = new TeamService(teamRepository);
        Assertions.assertEquals(2, teamService.findAll().size());
        Assertions.assertEquals("MIREA", teamService.findAll().get(0).getName());

    }


    @Test
    void create() {

        Team student = new Team();
        student.setName("MIREA");

        TeamService teamService = new TeamService(teamRepository);

        teamService.create(student);

        Mockito.verify(teamRepository).save(captor.capture());
        Team captured = captor.getValue();

        Assertions.assertEquals("MIREA", captured.getName());
    }
}