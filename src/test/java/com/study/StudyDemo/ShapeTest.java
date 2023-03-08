package com.study.StudyDemo;

import com.study.StudyDemo.polymorphism.Circle;
import com.study.StudyDemo.polymorphism.Rectangle;
import com.study.StudyDemo.polymorphism.Shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape1=new Circle(1);
        Shape shape2=new Rectangle(1,2);
        shape1.area();
        shape2.area();

    }
}
