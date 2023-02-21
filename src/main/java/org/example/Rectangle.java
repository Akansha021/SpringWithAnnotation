package org.example;

import org.springframework.stereotype.Component;

@Component("rectangle")
public class Rectangle implements Shapes{
    String color;

//    Rectangle(String color){
//        this.color=color;
//    }
    @Override
    public void printShape() {
        System.out.println("This is rectangle");
        System.out.println("This is "+color);
    }

    @Override
    public void getColor() {
        System.out.println("This is "+color);
    }

    @Override
    public void setColor(String color) {
        this.color =color;
    }
}
