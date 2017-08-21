package com.internship.sia.springidol.performers.juggler;

import com.internship.sia.springidol.exception.PerformanceException;
import com.internship.sia.springidol.Performer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JugglerDemo {
    public static void main(String[] args) throws PerformanceException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring-idol.xml"
        );

        Performer performer = (Performer) ctx.getBean("poeticDuke");
        performer.perform();
    }
}
