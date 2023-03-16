package com.study.StudyDemo.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class db {
    public static void main(String[] args) {

        try {
//            无需手动注册，直接使用即可
//            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbStudy","root","juweijia1.");
            String sql="select * from dbStudy.goods";
            PreparedStatement statement= conn.prepareStatement(sql);
            ResultSet result = statement.executeQuery();
            while(result.next()){
                System.out.println(result.getString("name")+result.getFloat("price")+result.getString("desp"));
//                System.out.println(result.getString("desp"));

            }
        } catch (Exception  e) {
            throw new RuntimeException(e);
        }
    }
}
