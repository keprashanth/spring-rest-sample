
package com.example.demo.controller;

import com.example.demo.model.Greeting;
import com.example.demo.service.GreetingService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/greetings")
public class GreetingController {
  private final GreetingService greetingService;

  public GreetingController(GreetingService greetingService) {
    this.greetingService = greetingService;
  }

  @GetMapping
  public ResponseEntity<Greeting> getGreeting(@RequestParam(required = false) String name) {
    String message = greetingService.greet(name);
    Greeting response = new Greeting(name, message);
    return ResponseEntity.ok(response);
  }

  @PostMapping
  public ResponseEntity<Greeting> createGreeting(@Valid @RequestBody Greeting request) {
    String message = greetingService.greet(request.getName());
    Greeting response = new Greeting(request.getName(), message);
    return ResponseEntity.ok(response);
  }
}
