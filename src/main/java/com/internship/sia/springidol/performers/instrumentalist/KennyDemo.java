package com.internship.sia.springidol.performers.instrumentalist;

import com.internship.sia.springidol.Performer;
import com.internship.sia.springidol.exception.PerformanceException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KennyDemo {
    public static void main(String[] args){
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring-idol.xml"
        );

        Performer gary = (Performer) ctx.getBean("gary");
        Performer david = (Performer) ctx.getBean("david");
        Performer frank = (Performer) ctx.getBean("frank");
        Performer taylor = (Performer) ctx.getBean("taylor");
        Performer stevie = (Performer) ctx.getBean("stevie");
        Performer kenny2 = (Performer) ctx.getBean("kenny2");
        try {
            gary.perform();
            kenny2.perform();
            david.perform();
            frank.perform();
            taylor.perform();
            stevie.perform();
        } catch (PerformanceException e) {
            System.err.println("Выступление данного участника отменяется!");
        }
    }
}
