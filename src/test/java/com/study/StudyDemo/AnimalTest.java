package com.study.StudyDemo;

import  com.study.StudyDemo.polymorphism.Animal;
import com.study.StudyDemo.polymorphism.Cat;
import com.study.StudyDemo.polymorphism.Dog;

public class AnimalTest {

    public static void main(String[] args) {
//        Animal one =new Animal();
//        向上转型、自动转型、隐士转型，（孩子仰头看爸爸）
//        父类引用指向子类实例,可以调用子类重写父类的方法，父类的派生方法，不能调用子类特有的方法
        Animal two=new Cat();
        Animal three=new Dog();

//        向上转型的另一种写法是
//        Cat cat=new Cat();
//        two=cat;
//
//        one.eat();
//        two.eat();
//        three.eat();



//        向下转型、强制类型转换（爸爸需要低头跟孩子交流）
//        子类引用指向父类对象，必须进行强制转换。可以调用子类特有的方法
//instanceof:判断左边的对象是不是右边类型的实例,使向下转型会更加的完全
        Cat tmpt=(Cat)two;//相当于是一个还原操作(要转换的对象得具备这个类的特征才行)
        tmpt.eat();
        tmpt.run();

        if(three instanceof Dog){
            Dog tmpt2=(Dog)three;
            tmpt2.sleep();
        }
        if(two instanceof Dog){

        }else{
            System.out.println("two 无法转换为Dog");
        }


    }
}
