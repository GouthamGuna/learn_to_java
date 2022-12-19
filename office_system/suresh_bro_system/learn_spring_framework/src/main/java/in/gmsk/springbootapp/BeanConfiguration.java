package in.gmsk.springbootapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
    @Bean
    public String getExample(){
        return "Hello World!";
    }
}
