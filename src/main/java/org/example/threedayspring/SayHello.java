package org.example.threedayspring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SayHello {

//    @Value("${app.message}")
//    private String message;

    @RequestMapping("/hello")
    public String sayHello(){
        return "Hello James";
    }


//    @GetMapping("/messagehello")
//    public String getMessage(){
//        return message;
//    }


}
