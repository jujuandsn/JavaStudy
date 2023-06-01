package com.study.StudyDemo.excelProcess;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
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
//        大类别具体的数值
        int sydcNum=0;
        int zfNum=0;
        int ggzcNum=0;
        int jyNum=0;
        int afNum=0;
        int zfBNum=0;
        int zfCNum=0;

//        创建一个map用来存储小类别具体的数值
        Map<String, Integer> sydcProduct=new HashMap<>();
        Map<String, Integer> zfProduct=new HashMap<>();
        Map<String, Integer> ggzcProduct=new HashMap<>();
        Map<String, Integer> jyProduct=new HashMap<>();
        Map<String, Integer> afProduct=new HashMap<>();
        Map<String, Integer> zfBProduct=new HashMap<>();
        Map<String, Integer> zfCProduct=new HashMap<>();
        try {
//            读取excel文件到对象中
            HSSFWorkbook book = new HSSFWorkbook(new FileInputStream("/Users/juju/Desktop/ologw19.xls"));
//            根据sheet名称获取表格页
//            HSSFSheet table = book.getSheet("导出计数_业务线");
            HSSFSheet table = book.getSheet("项目创建数据");
//            HSSFSheet table = book.getSheet("项目上线数据");
            for(int i=1; i<= table.getLastRowNum();i++){
//                判断属于哪个大类
                String content=table.getRow(i).getCell(3).getStringCellValue();
//                System.out.println(content);
                try{
                    buildProduct.buildSydc().get(content);
                }catch (Exception exception){

                }
                switch (buildProduct.buildSydc().get(content)){
                    case "sydc":
                        sydcNum+=1;
                        if(sydcProduct.containsKey(content)){
                            int result=sydcProduct.get(content)+1;
                            sydcProduct.remove(content);
                            sydcProduct.put(content,result);
                        }else{
                            sydcProduct.put(content,1);
                        }
                        break;
                    case "zfB":
                        zfBNum+=1;
                        if(zfBProduct.containsKey(content)){
                            int zfBtmp=zfBProduct.get(content)+1;
                            zfBProduct.remove(content);
                            zfBProduct.put(content,zfBtmp);
                        }else{
                            zfBProduct.put(content,1);
                        }
                        break;
                    case "zfC":
                        zfCNum+=1;
                        if(zfCProduct.containsKey(content)){
                            int zfCtmp=zfCProduct.get(content)+1;
                            zfCProduct.remove(content);
                            zfCProduct.put(content,zfCtmp);
                        }else{
                            zfCProduct.put(content,1);
                        }
                        break;
                    case "zf":
                        zfNum+=1;
                        if(zfProduct.containsKey(content)){
                            int zftmp=zfProduct.get(content)+1;
                            zfProduct.remove(content);
                            zfProduct.put(content,zftmp);
                        }else{
                            zfProduct.put(content,1);
                        }
                        break;
                    case "ggzc":
                        ggzcNum+=1;
                        if(ggzcProduct.containsKey(content)){
                            int ggzctmp=ggzcProduct.get(content)+1;
                            ggzcProduct.remove(content);
                            ggzcProduct.put(content,ggzctmp);
                        }else{
                            ggzcProduct.put(content,1);
                        }
                        break;
                    case "jy":
                        jyNum+=1;
                        if(jyProduct.containsKey(content)){
                            int jytmp=jyProduct.get(content)+1;
                            jyProduct.remove(content);
                            jyProduct.put(content,jytmp);
                        }else {
                            jyProduct.put(content,1);
                        }
                        break;
                    case "af":
                        afNum+=1;
                        if(afProduct.containsKey(content)){
                            int aftmp=afProduct.get(content)+1;
                            afProduct.remove(content);
                            afProduct.put(content,aftmp);
                        }else {
                            afProduct.put(content,1);
                        }
                        break;
                    default:
                        System.out.println("content");
                        break;

                }
//                if("sydc".equals(buildProduct.buildSydc().get(content))){
////                    System.out.println(buildProduct.buildSydc().get(content));
//                    sydcNum+=1;
//                    if(sydcProduct.containsKey(content)){
//                       int result=sydcProduct.get(content)+1;
//                        sydcProduct.remove(content);
//                        sydcProduct.put(content,result);
//                    }else{
//                        sydcProduct.put(content,1);
//                    }
//                }
            }
            System.out.println("租房B总数量为"+zfBNum);
            System.out.println("各类目"+zfBProduct);
            System.out.println("租房C总数量为"+zfCNum);
            System.out.println("各类目"+zfCProduct);
            System.out.println("租房其他总数量为"+zfNum);
            System.out.println("各类目"+zfProduct);
            int total=zfBNum+zfCNum+zfNum;
            System.out.println("租房总"+total);
            System.out.println("商业地产总数量为"+sydcNum);
            System.out.println("各类目"+sydcProduct);
            System.out.println("公共支持总数量为"+ggzcNum);
            System.out.println("各类目"+ggzcProduct);
            System.out.println("交易总数量为"+jyNum);
            System.out.println("各类目"+jyProduct);
            System.out.println("爱房总数量为"+afNum);
            System.out.println("各类目"+afProduct);
//            System.out.println(table.getFirstRowNum());
//            System.out.println(table.getLastRowNum());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
