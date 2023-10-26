package in.dev.gmsk.controller;

import in.dev.gmsk.annotations.InheritedAnnotation;

@InheritedAnnotation
public class AnnotatedSuperClass {

    public void methodOne(){
        System.out.println("AnnotatedSuperClass is true : " + AnnotatedSuperClass.class.isAnnotationPresent(InheritedAnnotation.class));
    }

    public static void main(String[] args) {

        AnnotatedSuperClass annotatedSuperClass = new AnnotatedSubClass();
        annotatedSuperClass.methodOne();
    }
}
