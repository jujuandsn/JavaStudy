package com.study.StudyDemo;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class StreamTest {
    public static void main(String args[]){
        List<String> arrlist = Arrays.asList("1","22","333");
        Stream<String> stream = arrlist.stream();
        List<String> list1 =stream.filter(str ->str.length() >=2).collect(Collectors.toList());
        System.out.println(list1);
    }




}
