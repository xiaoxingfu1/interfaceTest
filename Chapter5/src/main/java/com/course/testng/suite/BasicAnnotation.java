package com.course.testng.suite;

import org.testng.annotations.Test;

public class BasicAnnotation {
    //最基本的注解
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }
}
