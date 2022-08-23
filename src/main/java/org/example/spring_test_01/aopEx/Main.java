package org.example.spring_test_01.aopEx;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        //bean을 설정한 xml 파일이 있는 위치를 지정하여 설정파일을 얻어옴
        AbstractApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationCtx.xml");

        Dogs myDog = ctx.getBean("myDog", Dogs.class);

        myDog.getDogsInfo();
    }

}
