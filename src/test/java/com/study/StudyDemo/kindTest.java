package com.study.StudyDemo;

import com.study.StudyDemo.polymorphism.Animal;
import com.study.StudyDemo.polymorphism.Cat;
import com.study.StudyDemo.polymorphism.Dog;
import com.study.StudyDemo.polymorphism.Sheep;

public class kindTest {
    public static void main(String[] args) {
        Animal[] arr=new Animal[3];
        for (int i=0;i<3;i++){
            int random=(int)(Math.random()*3);
            if (random==0){
                arr[i]=new Cat();
            } else if (random==1) {
                arr[i]=new Dog();
            }else{
                arr[i]=new Sheep();
            }

        }
        for (Animal animal :
                arr) {
            animal.cry();
        }
        

    }
}
