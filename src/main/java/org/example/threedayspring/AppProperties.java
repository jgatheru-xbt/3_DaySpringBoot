package org.example.threedayspring;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app")
public class AppProperties {
    private String message;

    private Boolean paymentEnabled = true;
    private Boolean hmacStatus = true;

    private String maxAttempts;
    private String delay;
    private String multiplier;


    private String apiKey;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
