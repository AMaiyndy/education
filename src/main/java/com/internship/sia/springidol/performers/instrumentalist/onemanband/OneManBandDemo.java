package com.internship.sia.springidol.performers.instrumentalist.onemanband;

import com.internship.sia.springidol.Performer;
import com.internship.sia.springidol.exception.PerformanceException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class OneManBandDemo {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring-idol.xml"
        );

        Performer performer = (Performer) ctx.getBean("hank");
        try {
            performer.perform();
        } catch (PerformanceException e) {
            System.out.println("Выступление данного участника отменяется!");
        }
    }
}
