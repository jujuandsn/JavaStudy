package com.study.StudyDemo.polymorphism;

public class Sheep extends Animal{
    @Override
    public void eat() {
        System.out.println("羊吃草");
    }

    @Override
    public void cry() {
        System.out.println("咩咩咩");
    }
}
