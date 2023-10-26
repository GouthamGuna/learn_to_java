package in.dev.gmsk.controller;

import in.dev.gmsk.annotations.InheritedAnnotation;

public class AnnotatedSubClass extends AnnotatedSuperClass{

    @Override
    public void methodOne() {
        System.out.println("AnnotatedSubClass is true : " + AnnotatedSubClass.class.isAnnotationPresent(InheritedAnnotation.class));
    }
}
