package org.example.threedayspring;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "payment")
public class PaymentConfig {

    private boolean enabled;
    private Retry retry;
    private Security security;

    // getters & setters

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Retry getRetry() {
        return retry;
    }

    public void setRetry(Retry retry) {
        this.retry = retry;
    }

    public Security getSecurity() {
        return security;
    }

    public void setSecurity(Security security) {
        this.security = security;
    }

    public static class Retry {
        private int maxAttempts;
        private Backoff backoff;

        public int getMaxAttempts() { return maxAttempts; }
        public void setMaxAttempts(int maxAttempts) { this.maxAttempts = maxAttempts; }

        public Backoff getBackoff() { return backoff; }
        public void setBackoff(Backoff backoff) { this.backoff = backoff; }
    }

    public static class Backoff {
        private long delay;
        private double multiplier;

        public long getDelay() { return delay; }
        public void setDelay(long delay) { this.delay = delay; }

        public double getMultiplier() { return multiplier; }
        public void setMultiplier(double multiplier) { this.multiplier = multiplier; }
    }

    public static class Security {
        private String apiKey;
        private Hmac hmac;

        public String getApiKey() { return apiKey; }
        public void setApiKey(String apiKey) { this.apiKey = apiKey; }

        public Hmac getHmac() { return hmac; }
        public void setHmac(Hmac hmac) { this.hmac = hmac; }
    }

    public static class Hmac {
        private boolean enabled;
        private String algorithm;

        public boolean isEnabled() { return enabled; }
        public void setEnabled(boolean enabled) { this.enabled = enabled; }

        public String getAlgorithm() { return algorithm; }
        public void setAlgorithm(String algorithm) { this.algorithm = algorithm; }
    }
}

