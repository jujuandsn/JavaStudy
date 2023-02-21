package com.study.StudyDemo.excelProcess;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class BuildProduct {
    public Map<String,String> sydc;
//    public BuildProduct(){
//        this.sydc=this.buildSydc();
//    }
//    @Test
    public Map<String,String> buildSydc(){
        Map<String,String> map= new HashMap<>();

        map.put("用户增长","sydc");
        map.put("商业地产-经纪人服务","sydc");
        map.put("商业地产技术部","sydc");
        map.put("创新业务-小业主","sydc");
        map.put("创新业务-经纪人赋能","sydc");
        map.put("创新业务-数据服务(知楼）","sydc");
        map.put("创新业务—大底层建设(繁花）","sydc");
        map.put("创新业务-大业主","sydc");
        map.put("","zf");
        map.put("","ggzc");
        map.put("","af");
        map.put("","transaction");
//        map.put("","sydc");
//        map.put("","sydc");
//        map.put("","sydc");
//        System.out.println(map);
        return map;


    }

}
