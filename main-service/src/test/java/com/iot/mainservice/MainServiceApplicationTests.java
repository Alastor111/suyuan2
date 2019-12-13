package com.iot.mainservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.LinkedList;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MainServiceApplicationTests {

    @Test
    public void contextLoads() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext("com.iot.mainservice.test.AopConfig");
    }
}
