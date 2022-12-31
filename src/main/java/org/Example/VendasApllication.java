package org.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApllication {

   @Value("${application.name}")
    private String varpvtApplicationName;

    @GetMapping("/hello")
 public String helloWord(){
     return varpvtApplicationName;
 }
   public static void main(String[] args) {
      SpringApplication.run(VendasApllication.class, args);
}
}
