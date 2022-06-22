package com.breadmore.springtest;

import com.breadmore.springtest.config.Config;
import com.breadmore.springtest.logic.JavaSort;
import com.breadmore.springtest.logic.Sort;
import com.breadmore.springtest.service.SortService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        SortService sortService = context.getBean(SortService.class);

        System.out.println("[result] " + sortService.doSort(Arrays.asList(args)));
    }
}
