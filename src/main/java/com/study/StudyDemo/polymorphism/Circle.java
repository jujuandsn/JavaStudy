package com.study.StudyDemo.polymorphism;

public class Circle extends Shape{
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public void area() {
        System.out.println("圆形面积为"+3.14*getR()*getR());
    }
}
