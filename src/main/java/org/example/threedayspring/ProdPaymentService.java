package org.example.threedayspring;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class ProdPaymentService {
    public void pay(){
        System.out.println("Payment for prod");
    }
}
