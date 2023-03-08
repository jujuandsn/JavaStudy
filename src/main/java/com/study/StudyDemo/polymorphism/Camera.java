package com.study.StudyDemo.polymorphism;

import com.study.StudyDemo.IPhoto;

public class Camera implements IPhoto {
    @Override
    public void photo() {
        System.out.println("相机具有拍照的能力");
    }


    public void tel() {
        System.out.println("相机具有打电话的能力？智能手机吧你是");
    }

    @Override
    public void connection() {
        IPhoto.super.connection();//调用接口中的默认方法
    }
}
