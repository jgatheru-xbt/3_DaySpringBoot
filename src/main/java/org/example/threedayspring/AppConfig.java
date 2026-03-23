//package org.example.threedayspring;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Primary;
//import tools.jackson.databind.ObjectMapper;
//import tools.jackson.databind.SerializationFeature;
//
//@org.springframework.context.annotation.Configuration
//public class AppConfig {
//
//    @Bean
//    @Primary
//    public ObjectMapper objectMapper(){
//        ObjectMapper mapper = new ObjectMapper();
//
//        // Custom configurations
//
//        mapper.findAndRegisterModules();
//        mapper.enable(SerializationFeature.INDENT_OUTPUT);
//
//        return mapper;
//    }
//}
