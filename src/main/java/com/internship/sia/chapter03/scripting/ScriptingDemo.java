package com.internship.sia.chapter03.scripting;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ScriptingDemo {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                "chapter03/scripting.xml"
        );

        Coconut coconut = (Coconut) context.getBean("coconut");
        coconut.drinkThemBothUp();
    }
}
