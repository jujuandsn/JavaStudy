package com.study.StudyDemo;

/**
 * 具有照相能力的接口
 */
public interface IPhoto {
//    public abstract可以省略
    public void photo();
    void tel();
//    常量可以省略public static final
    int TEMP=20;

//    默认方法：因为接口中如果有很多方法，都需要实现，但实际有一些方法实现类可能并不需要,所以就出现了default方法，
//    可以拥有方法体，在实现类中不需要一定要实现接口中的这个默认方法
    default void connection(){
        System.out.println("this is a default method");
    }
//    静态方法在实现类中不能够重写
    static void stop(){
        System.out.println("this is a static method");
    }
}
