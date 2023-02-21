package org.example;

import org.springframework.beans.factory.annotation.Value;

public class Square implements Shapes{

    String color;
    @Override
    public void printShape() {
        System.out.println("This is square");
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
