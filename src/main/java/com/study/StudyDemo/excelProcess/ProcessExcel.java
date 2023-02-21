package com.study.StudyDemo.excelProcess;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class ProcessExcel {
    public String path;
//    public ProcessExcel(String path){
//        this.path= path;
//    }


    @Test
    public void base(){
        BuildProduct buildProduct=new BuildProduct();
        int sydcNum=0;

        Map<String, Integer> sydcProduct=new HashMap<>();
        try {
//            读取excel文件到对象中
            HSSFWorkbook book = new HSSFWorkbook(new FileInputStream("/Users/juju/Downloads/olog需求创建数.xls"));

//            根据sheet名称获取表格页

//            HSSFSheet table = book.getSheet("导出计数_业务线");
            HSSFSheet table = book.getSheet("项目创建数据");
            for(int i=1; i<= table.getLastRowNum();i++){
//                判断属于哪个大类
                String content=table.getRow(i).getCell(3).getStringCellValue();
//                System.out.println(content);
                if("sydc".equals(buildProduct.buildSydc().get(content))){
//                    System.out.println(buildProduct.buildSydc().get(content));
                    sydcNum+=1;
                    if(sydcProduct.containsKey(content)){
                       int result=sydcProduct.get(content)+1;
                        sydcProduct.remove(content);
                        sydcProduct.put(content,result);
                    }else{
                        sydcProduct.put(content,1);
                    }
                }
            }
            System.out.println("商业地产总数量为"+sydcNum);
            System.out.println("各类目"+sydcProduct);
//            System.out.println(table.getFirstRowNum());
//            System.out.println(table.getLastRowNum());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
