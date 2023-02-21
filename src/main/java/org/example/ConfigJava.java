package org.example;

import org.example.Rectangle;
import org.example.Shapes;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
class ConfigJava {

//    @Bean(name = "shapes")
//    public Shapes getShapes(){
//        Shapes shapes=new Square();
//        shapes.setColor("Blue");
//        return shapes;
////        return new Rectangle("Red");
//    }
}