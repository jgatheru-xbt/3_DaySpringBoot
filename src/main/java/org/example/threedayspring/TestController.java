package org.example.threedayspring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
   private final AppProperties properties;

   public TestController(AppProperties properties) {
       this.properties = properties;
   }

   @GetMapping("/message")
    public String getMessage(){
       return properties.getMessage();
   }
}

//the @ConfigurationProperties(prefix = "app") annotation binds the group of external configurations properties that start with prefix "app" to a single, strongly typed java object(POJO or Java record)
