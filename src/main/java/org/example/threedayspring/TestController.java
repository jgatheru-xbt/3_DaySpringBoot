package org.example.threedayspring;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    private final PaymentConfig props;

//   public TestController(AppProperties properties) {
//       this.properties = properties;
//   }


    public TestController(PaymentConfig  props){
        this.props = props;
    }

   @GetMapping("/payment-config")
    public String getMessage(){
       return "Enabled: " + props.isEnabled() +
               "\nMax Attempts: " + props.getRetry().getMaxAttempts() +
               "\nBackoff Delay: " + props.getRetry().getBackoff().getDelay() +
               "\nMultiplier: " + props.getRetry().getBackoff().getMultiplier() +
               "\nAPI Key: " + props.getSecurity().getApiKey() +
               "\nHMAC Enabled: " + props.getSecurity().getHmac().isEnabled() +
               "\nAlgorithm: " + props.getSecurity().getHmac().getAlgorithm();

   }
}

//the @ConfigurationProperties(prefix = "app") annotation binds the group of
// external configurations properties that start with prefix "app"
// to a single, strongly typed java object(POJO or Java record)
