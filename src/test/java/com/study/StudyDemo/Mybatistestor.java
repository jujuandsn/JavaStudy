package com.study.StudyDemo;

import com.study.StudyDemo.entity.Info;
import com.study.StudyDemo.utils.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.Reader;
import java.sql.Connection;
import java.util.List;

public class Mybatistestor {

    @Test
    public void testMybatisSessionFactory() throws IOException {
//按照字符流的方式读取文件.利用reader加载classpath下的配置文件信息，但是没有保证他的唯一性
        Reader reader=Resources.getResourceAsReader("mybatis-con.xml");
//        利用构造者模式初始化sqlsessionfactory对象，并读取配置文件内容
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        System.out.println("加载成功");
        SqlSession sqlSession= null;
//        创建sqlSession，是JDBC扩展类，用来操作数据库
        try {
            sqlSession= sqlSessionFactory.openSession();

//        测试用，得到数据库连接对象
            Connection connection=sqlSession.getConnection();
            System.out.println(connection);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            /*
            type=pooled,close只是将它回收到连接池中，而不是关闭这个链接
            type=unpooled，代表直连会调用connection.close（）关闭这个链接
             */
            if (sqlSession !=null){
                sqlSession.close();
            }

        }

    }
    @Test
    public void testInfoSelectAll(){
        SqlSession sqlSession = null;
        try {
            sqlSession= MybatisUtil.openSqlSession();
            List<Info> result=sqlSession.selectList("info.selectAll");
            for (Info info:result){
                System.out.println(info.getName()+info.getAddress());
            }
        }catch (Exception e){
            throw e;
        }
//        finally {
//            mybatisUtil.closeSqlSession(sqlSession);
//        }

    }
}
