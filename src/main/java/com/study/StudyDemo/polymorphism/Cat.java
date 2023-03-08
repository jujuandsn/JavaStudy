package com.study.StudyDemo.polymorphism;

public class Cat extends Animal{
    //特有的属性：体重，方法：跑动，吃东西
    private double weight;
    public Cat(){

    }
    public Cat(String name, int month,double weight){
//        super(name,month);下边两行可以直接用super这一句替代掉
        this.setMonth(month);
        this.setName(name);
        this.weight=weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void run(){
        System.out.println("小猫快乐的奔跑");
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼～～");
    }
    public void play(){
        System.out.println("猫咪玩线球");
    }
    @Override
    public void cry(){
        System.out.println("喵喵喵");
    }
}
