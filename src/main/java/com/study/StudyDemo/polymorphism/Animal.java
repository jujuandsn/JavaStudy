package com.study.StudyDemo.polymorphism;

abstract public  class Animal {
    private String name;
    private int month;
    public Animal(){

    }
    public Animal(String name,int month){
        this.name=name;
        this.month=month;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }
//    子类必须实现这个方法，父类的这个方法不能具有方法体
    public abstract void eat();
//    父类的静态方法不能被子类重写
    public static void say(){
        System.out.println("hi");
    }
    public void cry(){

    }
}
