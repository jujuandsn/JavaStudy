package com.study.StudyDemo.polymorphism;

public class Rectangle extends Shape{
    private double l;
    private double s;

    public Rectangle(double l, double s) {
        this.l = l;
        this.s = s;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    public double getS() {
        return s;
    }

    public void setS(double s) {
        this.s = s;
    }

    @Override
    public void area() {
        System.out.println("方形面积为"+getL()*getS());
    }
}
