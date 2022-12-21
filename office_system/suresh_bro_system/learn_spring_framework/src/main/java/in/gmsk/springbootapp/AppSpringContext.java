package in.gmsk.springbootapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppSpringContext {
    public static void main(String[] args) {

        // 1. Launch the Spring Context
        var context=new AnnotationConfigApplicationContext(BeanConfiguration.class);

        // 2. Configure the things that we want spring to manage the BeanConfiguration -@Configuration & @Bean

        // 3. Retrieve Bean manged by Spring
        System.out.println(context.getBean("getName"));

        System.out.println(context.getBean("getAge"));

        System.out.println(context.getBean("person"));

        System.out.println(context.getBean("address2"));
    }
}
