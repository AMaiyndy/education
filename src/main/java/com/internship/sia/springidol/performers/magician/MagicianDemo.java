package com.internship.sia.springidol.performers.magician;

import com.internship.sia.springidol.Performer;
import com.internship.sia.springidol.exception.PerformanceException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MagicianDemo {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring-idol.xml"
        );

        Performer magician = (Performer) ctx.getBean("harry");

        try {
            magician.perform();
        } catch (PerformanceException e) {
            System.err.println("Выступление данного участника отменяется!");
        }


    }
}
