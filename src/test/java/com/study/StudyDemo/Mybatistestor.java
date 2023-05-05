package com.study.StudyDemo;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.Reader;

public class Mybatistestor {
    @Test
    public void testMybatisSessionFactiry() throws IOException {
//按照字符流的方式读取文件.利用reader加载classpath下的配置文件信息
        Reader reader=Resources.getResourceAsReader("mybatis-con.xml");
//        初始化sqlsessionfactory对象，并读取配置文件内容
        SqlSessionFactory sqlSessionFactory=new SqlSessionFactoryBuilder().build(reader);
        System.out.println("加载成功");
    }
}
