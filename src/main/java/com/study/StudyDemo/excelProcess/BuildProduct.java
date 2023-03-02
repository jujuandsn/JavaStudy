package com.study.StudyDemo.excelProcess;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class BuildProduct {
//    public Map<String,String> sydc;
//    public BuildProduct(){
//        this.sydc=this.buildSydc();
//    }
//    @Test
    public Map<String,String> buildSydc(){
        Map<String,String> map= new HashMap<>();
//商业地产
        map.put("用户增长","sydc");
        map.put("商业地产-经纪人服务","sydc");
        map.put("商业地产技术部","sydc");
        map.put("创新业务-小业主","sydc");
        map.put("创新业务-经纪人赋能","sydc");
        map.put("创新业务-数据服务(知楼）","sydc");
        map.put("创新业务—大底层建设(繁花）","sydc");
        map.put("创新业务-大业主","sydc");
//          租房
        map.put("租房-租客体验","zf");
        map.put("租房-品牌公寓","zf");
        map.put("租房-运营活动","zf");
        map.put("租房-房东组","zf");
        map.put("租房-经纪组","zf");
        map.put("前端-租房组","zf");
        map.put("前端-公寓组","zf");
        map.put("58GJ移动技术部","zf");
        map.put("租房技术服务","zf");
        map.put("58GJ数据策略部","zf");
        map.put("租房","zf");

//公共支持
        map.put("前端技术部（北京侧）","ggzc");
        map.put("基础平台-低代码平台","ggzc");
        map.put("基础平台-基础服务（房源服务）","ggzc");
        map.put("基础平台-房产开放平台","ggzc");
        map.put("积木系统","ggzc");
        map.put("前端-基础服务组","ggzc");
        map.put("墨斗项目","ggzc");
        map.put("天眼项目","ggzc");
        map.put("58GJ质量保障部","ggzc");
        map.put("58-online问题池","ggzc");



        map.put("新房直销","af");
        map.put("交易服务","jy");

//        System.out.println(map);
        return map;


    }

}
