package com.study.StudyDemo;

import com.study.StudyDemo.entity.zSydcBrokerToolTBugStatement;
import com.study.StudyDemo.utils.MybatisUtil;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.apache.ibatis.io.Resources;

import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class SydcBrokerToolTBugStatementTest {
    @Test
    public void zSydcBrokerToolTBugStatement() throws IOException {
//        Reader reader = Resources.getResourceAsReader("mybatis-con.xml");
//        SqlSessionFactory sqlSessionFactory =new SqlSessionFactoryBuilder().build(reader);
//        System.out.println("成功加载");
        SqlSession sqlSession = null;
        try{
            sqlSession = MybatisUtil.openSqlSession();
            Map<String,Integer> map= new HashMap<>();
            map.put("week",15);
            map.put("year",2022);
//            List<zSydcBrokerToolTBugStatement> result = sqlSession.selectList("zSydcBrokerToolTBugStatement.selectByweekAndYear",14);
           zSydcBrokerToolTBugStatement result = sqlSession.selectOne("zSydcBrokerToolTBugStatement.selectByweekAndYear",map);
            System.out.println(result);
//            for (zSydcBrokerToolTBugStatement rowContent:
//                 result) {
//                System.out.println(rowContent.getStatement());
//            }
        }catch (Exception e){
            throw e;
        }finally {
            if (sqlSession !=null){
                sqlSession.close();
            }
        }
    }

//    @Test
//    public void interfaceTest(){
//        SqlSession sqlSession = null;
//        sqlSession = MybatisUtil.openSqlSession();
//
//    }
}
