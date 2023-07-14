//package com.study.StudyDemo.jdbc;
//
//import com.study.StudyDemo.utils.JDBCUtils;
//import org.junit.jupiter.api.Test;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.SQLException;
//
//public class jdbcCRUDDemo {
//    @Test
//    /*
//    保存操作
//     */
//    public void addDemo(){
//        Connection conn= null;
//        PreparedStatement preparedStatement= null;
//        try{
//////            JDBCUtils.loadDriver();
////            Class.forName("com.mysql.cj.jdbc.Driver");
////            localhost:3306可省略
//            conn = JDBCUtils.getConnection();
////            conn = DriverManager.getConnection("jdbc:mysql:///dbStudy","root","juweijia1.");
//            String sql= "insert into dbStudy.goods values(null,'mac1','1000','mac电脑2')";
//            preparedStatement = conn.prepareStatement(sql);
//            int i =preparedStatement.executeUpdate();//i为影响的行数
//            if (i>0){
//                System.out.println("插入成功，影响"+i+"行");
//            }
//        }catch (Exception e){
//            e.printStackTrace();
//        }finally {
//            JDBCUtils.release(preparedStatement,conn);
////            if (preparedStatement != null){
////                try {
////                   preparedStatement.close();
////                } catch (Exception e) {
//////                    throw new RuntimeException(e);
////                    e.printStackTrace();
////                }
////                preparedStatement = null;
////            }
//        }
//    }
//
//    /*
//    修改
//     */
//    @Test
//    public void updateDemo(){
//        Connection conn = null;
//        PreparedStatement ps = null;
//         try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conn = DriverManager.getConnection("jdbc:mysql:///dbStudy","root","juweijia1.");
//            String sql="update goods set price='800.0',desp='苹果蓝牙耳机' where id=3";
//            ps=conn.prepareStatement(sql);
//            int i = ps.executeUpdate();
//            if (i > 0){
//                System.out.println("更新成功，影响"+i+"行");
//            }
//         }catch (Exception e){
//             e.printStackTrace();
//         }finally {
//             if (ps != null){
//                 try {
//                     ps.close();
//                 } catch (SQLException e) {
//                     e.printStackTrace();
//                 }
//                 ps = null;
//             }
//             if (conn != null){
//                 try {
//                     conn.close();
//                 } catch (SQLException e) {
//                     e.printStackTrace();
//                 }
//                 conn = null;
//             }
//         }
//    }
//    /*
//    删除
//     */
//    @Test
//    public void deleteDemo(){
//        Connection conn = null;
//        PreparedStatement ps = null;
//        try{
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            conn = DriverManager.getConnection("jdbc:mysql:///dbStudy","root","juweijia1.");
//            String sql = "delete from goods where id=6";
//            ps = conn.prepareStatement(sql);
//            int i = ps.executeUpdate();
//            if(i > 0){
//                System.out.println("删除成功");
//            }
//        }catch(Exception e){
//            e.printStackTrace();
//        }finally {
//
//        }
//    }
//}
