package org.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApllication {
 @GetMapping("/hello")
 public String helloWord(){
     return "Hello Word Spring Boot Application";
 }
   public static void main(String[] args) {
      SpringApplication.run(VendasApllication.class, args);
}
}
