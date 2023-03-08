package com.study.StudyDemo;

import com.study.StudyDemo.polymorphism.Camera;

public class PhoneTest {
    public static void main(String[] args) {
        IPhoto ip=new Camera();
        ip.photo();
        int result=IPhoto.TEMP;
    }
}
