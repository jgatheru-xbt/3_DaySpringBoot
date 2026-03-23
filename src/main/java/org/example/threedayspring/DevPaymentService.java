package org.example.threedayspring;


import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class DevPaymentService {
    public void pay(){
        System.out.println("Payment for dev ");
    }
}
