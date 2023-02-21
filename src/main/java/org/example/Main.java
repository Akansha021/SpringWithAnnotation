package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;



public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext(ConfigJava.class);
        Rectangle shapes= applicationContext.getBean("rectangle",Rectangle.class);
        shapes.printShape();
    }
}





