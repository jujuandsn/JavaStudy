package com.study.StudyDemo.polymorphism;

public class Master {
    /*
    喂宠物
    喂猫咪：吃完东西后，主人带着玩毛线球
    喂狗狗：吃完东西，主人带着去睡觉
     */

//    方案1：通过重载，传入不同的参数类型，调用不同的方法
//    public void feed(Cat cat){
//        cat.eat();
//        cat.play();
//    }
//    public void feed(Dog dog){
//        dog.eat();
//        dog.play();
//    }
//    方案2：传入父类，在方法中通过类型转化，调用指定子类的方法.
    public void feed(Animal animal){
        if(animal instanceof Cat){
            Cat temp=(Cat)animal;
            temp.eat();
            temp.play();
        } else if (animal instanceof Dog) {
            Dog temp=(Dog)animal;
            temp.eat();
            temp.play();
        }
    }


/*
饲养什么样的宠物
时间多：狗
时间少：猫咪
 */
//    方案1
    public Dog hasManyTime(){
        System.out.println("适合狗");
        return new Dog();
    }
    public Cat hasLittleTime(){
        System.out.println("适合猫");
        return new Cat();
    }

    //方案二
    public Animal raise(boolean isHasManyTime){
        if (isHasManyTime){
            System.out.println("适合狗");
            return new Dog();
        }else{
            System.out.println("适合猫");
            return new Cat();
        }
    }
}
