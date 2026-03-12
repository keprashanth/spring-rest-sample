
package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {
  public String greet(String name) {
    String safeName = (name == null || name.isBlank()) ? "World" : name.trim();
    return "Hello, " + safeName + "!";
  }
}
