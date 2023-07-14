//package com.study.StudyDemo.jdbc;
//
//import java.sql.*;
//
//public class db {
//    public static void main(String[] args) {
//        Connection conn = null;
//        PreparedStatement ps = null;
//        ResultSet rs = null;
//        try {
////            无需手动注册，直接使用即可
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbStudy","root","juweijia1.");
//            String sql1="insert into goods values(null,'耳机','200.0','蓝牙耳机')";
//
//            String sql="select * from dbStudy.goods";
//            ps = conn.prepareStatement(sql);
//            PreparedStatement ps1 = conn.prepareStatement(sql1);
//            int i=ps1.executeUpdate();
//            rs= ps.executeQuery();
//            if (i>0){
//                while(rs.next()){
//                    System.out.println(rs.getString("name")+rs.getFloat("price")+rs.getString("desp"));
////                System.out.println(result.getString("desp"));
//
//                }
//            }else {
//                System.out.println("添加失败");
//            }
////            rs = ps.executeQuery();
//
//        } catch (Exception  e) {
//           e.printStackTrace();
//        } finally{
//            //不管发生异常与否都执行
//            //释放资源
//            if (rs != null){
//                try{
//                    rs.close();
//                }catch (SQLException sqlEX){
//                    //ignore
//                }
////                手动设置为null,垃圾回收机制会更早的被垃圾回收机制回收
//                rs = null;
//            }
//            if (ps != null){
//                try{
//                    ps.close();
//                }catch(SQLException sqlException){}
//                ps = null;
//            }
//            if (conn != null){
//                try{
//                    conn.close();
//                }catch(SQLException sqlException){}
//                conn = null;
//            }
//        }
//    }
//}
