package com.study.StudyDemo.utils;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/*
JDBC工具类
 */
public class JDBCUtils {
    private static final String driverClass;
    private static final String url;
    private static final String name;
    private static final String password;
//第三步优化：将参数放到配置文件中，工具类只用来解析配置文件就好，这样就避免了因为参数不同，频繁修改工具类的情况了
//    第二步优化：将变量提出静态初始化块只在类加载的时候执行，且只执行一次
    static{
//        3-1加载属性文件并解析
         Properties props = new Properties();
//        3-2获得属性文件输入流---使用类的加载器的方式进行获取，而不是用FileInputStream("/src/jdbc.properties)
        InputStream is = JDBCUtils.class.getClassLoader().getResourceAsStream("jdbc.properties");

        try {
            props.load(is);
        } catch (IOException e) {
            System.out.println("初始化失败"+e);
        }
        driverClass = props.getProperty("driverClass");
        url = props.getProperty("url");
        name = props.getProperty("name");
        password = props.getProperty("password");
/*
方法二具体实现：
 */
//        driverClass = "com.mysql.cj.jdbc.Driver";
//        url = "jdbc:mysql:///dbStudy";
//        name = "root";
//        password = "juweijia1.";
    }
//    注册驱动
    public static void loadDriver() throws ClassNotFoundException {
        Class.forName(driverClass);
        System.out.println("初始化成功");
    }
//    获得链接
    public static Connection getConnection() throws Exception {
        loadDriver();
        Connection conn = DriverManager.getConnection(url,name,password);
        return conn;
    }
//    资源的释放，区分增删改以及查询
    public static void release(PreparedStatement ps, Connection conn){
        if (ps != null){
            try{
                ps.close();
            }catch(SQLException sqlException){}
            ps = null;
        }
        if (conn != null){
            try{
                conn.close();
            }catch(SQLException sqlException){}
            conn = null;
        }
    }
    public static void release(ResultSet rs, PreparedStatement ps, Connection conn){
        if (rs != null){
            try{
                rs.close();
            }catch (SQLException sqlEX){
                //ignore
            }
//                手动设置为null,垃圾回收机制会更早的被垃圾回收机制回收
            rs = null;
        }
        if (ps != null){
            try{
                ps.close();
            }catch(SQLException sqlException){}
            ps = null;
        }
        if (conn != null){
            try{
                conn.close();
            }catch(SQLException sqlException){}
            conn = null;
        }

    }
}
