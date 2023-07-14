package com.study.StudyDemo.mapper;

import com.study.StudyDemo.entity.zSydcBrokerToolTBugStatement;

import java.util.List;

public interface OnlineBugPlat {
    List<zSydcBrokerToolTBugStatement> selectByweek(Integer week);
    zSydcBrokerToolTBugStatement selectByweekAndYear(java.util.Map map);
}
