//package com.study.StudyDemo.jdbc;
//
//import com.mchange.v2.c3p0.ComboPooledDataSource;
//import com.study.StudyDemo.utils.JDBCUtils;
//import org.junit.jupiter.api.Test;
//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//
//public class C3p0Demo {
//    /*
//    手动设置连接池
//
//     */
//    @Test
//    public void demo1(){
////创建链接池
//        ComboPooledDataSource dataSource= new ComboPooledDataSource();
//
////        获得链接
//        Connection conn =null;
//        PreparedStatement preparedStatement = null;
//        ResultSet rs = null;
//        try{
//            //        设置连接池参数
//            dataSource.setDriverClass("com.mysql.cj.jdbc.Driver");
//            dataSource.setJdbcUrl("jdbc:mysql:///dbStudy");
//            dataSource.setUser("root");
//            dataSource.setPassword("juweijia1.");
//            conn = dataSource.getConnection();
////            sql
//            String sql = "select * from goods";
////            预编译
//            preparedStatement = conn.prepareStatement(sql);
//            rs = preparedStatement.executeQuery();
//            while(rs.next()){
//                System.out.println(rs.getString("name"));
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }finally {
//            JDBCUtils.release(rs,preparedStatement,conn);
//        }
//    }
//}
