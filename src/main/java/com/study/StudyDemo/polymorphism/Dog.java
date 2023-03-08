package com.study.StudyDemo.polymorphism;

public class Dog extends Animal{
    //属性：性别，方法：睡觉，方法，吃东西
    private String sex;
    public Dog(){

    }
    public Dog(String name, int month,String sex){
        super(name, month);
        this.setSex(sex);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    public void sleep(){
        System.out.println("狗狗有午睡的习惯");
    }
    @Override
    public void eat() {
        System.out.println("狗吃骨头～～");
    }
    public void play(){
        System.out.println("狗狗睡觉");
    }
    @Override
    public void cry(){
        System.out.println("汪汪汪");
    }
}
