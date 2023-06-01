package com.study.StudyDemo.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
/*
创建全局唯一的sqlsessionfactory对象
 */
public class MybatisUtil {
//    通过static来保证sqlSessionFactory是属于类而不是对象的，实现了他的唯一性(属于类而不属于对象)
    private static SqlSessionFactory sqlSessionFactory= null;
//    初始化静态对象
    static {
        try {
            Reader reader=Resources.getResourceAsReader("mybatis-con.xml");
            System.out.println("读取配置信息");
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        } catch (IOException e) {
            e.printStackTrace();
//            初始化错误通知调用者
            throw new ExceptionInInitializerError(e);
        }
    }
    public static SqlSession openSqlSession(){
        return sqlSessionFactory.openSession();
    }
    public static void closeSqlSession(SqlSession sqlSession){
        if (sqlSession != null) {
            sqlSession.close();
        }
    }
}
