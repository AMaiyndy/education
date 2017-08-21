package com.internship.sia.chapter03.fuddifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FuddifierDemo {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "chapter03/fuddifier.xml"
        );

        Rabbit rabbit = (Rabbit) ctx.getBean("bugs");
        System.out.println(rabbit.getDescription());

    }
}
