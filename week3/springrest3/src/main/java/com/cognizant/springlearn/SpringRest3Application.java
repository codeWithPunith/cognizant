package com.cognizant.springlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringRest3Application {
    public static void main(String[] args) {
        SpringApplication.run(SpringRest3Application.class, args);
        displayCountrySingleton();
        System.out.println("--- Now demonstrating prototype scope ---");
        displayCountryPrototype();
    }

    public static void displayCountrySingleton() {
        ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
        Country country = context.getBean("country", Country.class);
        Country anotherCountry = context.getBean("country", Country.class);
        ((ClassPathXmlApplicationContext) context).close();
    }

    public static void displayCountryPrototype() {
        // modify XML at runtime? create a new context with overridden bean definition
        org.springframework.beans.factory.xml.XmlBeanDefinitionReader reader;
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext();
        reader = new org.springframework.beans.factory.xml.XmlBeanDefinitionReader(context);
        reader.loadBeanDefinitions(new org.springframework.core.io.ClassPathResource("country.xml"));
        // register prototype bean definition by altering the existing definition
        org.springframework.beans.factory.config.BeanDefinition bd = context.getBeanFactory().getBeanDefinition("country");
        bd.setScope(org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE);
        context.refresh();

        Country c1 = context.getBean("country", Country.class);
        Country c2 = context.getBean("country", Country.class);
        context.close();
    }
}
