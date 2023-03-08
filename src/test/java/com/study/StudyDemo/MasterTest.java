package com.study.StudyDemo;

import com.study.StudyDemo.polymorphism.Animal;
import com.study.StudyDemo.polymorphism.Cat;
import com.study.StudyDemo.polymorphism.Master;

public class MasterTest {
    public static void main(String[] args) {
        Master master=new Master();
        Cat cat1=new Cat();
        master.feed(cat1);//在这首先进行了一个向上转换，在方法里又进行了一个向下转化

        boolean isManyTime=true;
        Animal temp;
        if (isManyTime){
            temp=master.hasManyTime();
        }else{
            temp=master.hasLittleTime();
        }
    }
}
