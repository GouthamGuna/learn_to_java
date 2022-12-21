package in.gmsk.springbootapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*
            *   Eliminate verbosity in create java beans
            *   Public accessor method, constructor
            *   equals, hashcode and toString automatically create.
            *
            *   Release JDK 16 -> record
            * */

    record Person (String name, int age) { }
    record Address (String firstLine, String city, int pinCode) { }

@Configuration
public class BeanConfiguration {
    @Bean
    public String getName(){
        return "Hello World!";
    }
    @Bean
    public int  getAge(){
        return 21;
    }
    @Bean
    public Person person(){
        return new Person("U1", 21);
    }

    // customize the Bean name
    @Bean(name = "address2")
    public Address address(){
       return new Address("Pannipuram", "Theni", 625531);
    }
}
