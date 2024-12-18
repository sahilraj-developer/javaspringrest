package net.engineeringdigest.journalApp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {
  @GetMapping("/healthchecker")
  public String healthCheck() {
      return "OK";
    }
}
