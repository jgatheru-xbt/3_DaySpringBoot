package org.example.threedayspring;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Component
@Profile("prod")
public class ProdStartupBean {

    @PostConstruct // annotation is a lifecycle hook used in dependency injection frameworks (like Spring or Jakarta EE/CDI) to mark a method that should be executed after a bean has been instantiated and all its dependencies have been injected, but before it is put into service.
    public void init(){
        System.out.println(">>>prod startup bean initialized");
    }
}
