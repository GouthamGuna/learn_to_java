package in.dev.gmsk.controller;

import in.dev.gmsk.annotations.Important;
import in.dev.gmsk.annotations.ImportantString;
import in.dev.gmsk.annotations.RunImmediately;
import in.dev.gmsk.model.User;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CreatingAnnotationsMain {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {

        User obj = new User("Saran", "USI:2014-04", "Male");

        if (obj.getClass().isAnnotationPresent(Important.class)) {
            System.out.println("This thing is important.");
        } else {
            System.out.println("This thing is not-important.");
        }

        for (Method method : obj.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);
                for (int i = 0; i < annotation.times(); i++) {
                    method.invoke(obj);
                }
            }
        }

        for(Field field : obj.getClass().getDeclaredFields()){
            if (field.isAnnotationPresent(ImportantString.class)) {
                Object objectValue = field.get(obj);

               /* if(objectValue instanceof String stringValue){
                    System.out.println("stringValue = "+stringValue);
                }*/
            }
        }
    }
}
