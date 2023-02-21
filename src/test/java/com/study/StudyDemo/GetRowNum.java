package com.study.StudyDemo;

import com.study.StudyDemo.excelProcess.BuildProduct;
import com.study.StudyDemo.excelProcess.ProcessExcel;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Map;

@SpringBootTest
public class GetRowNum {

     BuildProduct buildProduct=new BuildProduct();
    @Test
    void get(){
//        Map<String,String> sydc=buildProduct.buildSydc();
//        System.out.println(sydc);
    }
}
