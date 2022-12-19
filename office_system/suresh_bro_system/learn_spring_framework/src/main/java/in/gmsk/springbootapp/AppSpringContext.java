package in.gmsk.springbootapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppSpringContext {
    public static void main(String[] args) {

        // Launch the Spring Context
        var context=new AnnotationConfigApplicationContext(BeanConfiguration.class);

        // Retrieve Bean manged by Spring
        System.out.println(context.getBean("getExample"));
    }
}
