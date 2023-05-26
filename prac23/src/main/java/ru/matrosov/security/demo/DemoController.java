package ru.matrosov.security.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.matrosov.security.user.User;
import ru.matrosov.security.user.UserRepository;
import ru.matrosov.security.user.UserService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/demo-controller")
public class DemoController {

  private final UserService userService;


  @GetMapping
  public ResponseEntity<String> sayHello() {
    return ResponseEntity.ok("Hello from secured endpoint");
  }

  @GetMapping("/users")
  public ResponseEntity<List<User>> readAll() {
    return ResponseEntity.ok(userService.findAll());
  }


}
