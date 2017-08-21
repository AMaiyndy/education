package com.internship.sia.chapter03.propeditor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PropEditorDemo {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "chapter03/propeditor.xml"
        );

        Contact contact = (Contact) ctx.getBean("contact");
        System.out.println(contact.getPhoneNumber());
    }
}
