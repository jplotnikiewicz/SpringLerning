package springFramework.core;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;


public class Core {

    static int counter = 1;

    public static void main (String [] args){
        start7();

    }

    public static void start7(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring/Core/beans.xml");
        SmapleClass2 sample = context.getBean("one",SmapleClass2.class);
        System.out.println(sample.getText());
    }

    public static void start6(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring/Core/services.xml");
        SmapleClass2 sample = context.getBean("sample22",SmapleClass2.class);
        System.out.println(sample.getText());
        System.out.println(sample.sampleClass.getText());
    }


    public static void start5(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring/Core/services.xml");
        SmapleClass2 sample = context.getBean("sample2",SmapleClass2.class);
        System.out.println(sample.getText());
        System.out.println(sample.sampleClass.getText());
        System.out.println(sample.getDecimal());
    }


    public static void start4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring/Core/services.xml");
        SampleClass sample = context.getBean("noStaticSample",SampleClass.class);
        System.out.println(sample.getText());
    }

    public static void start3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring/Core/services.xml");
        SampleClass sample = context.getBean("sample",SampleClass.class);
        System.out.println(sample.getText());
    }

    public static void start2(){
        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("Spring/Core/services.xml");
        context.refresh();
        PetStoreServiceImpl petStoreService = (PetStoreServiceImpl) context.getBean("petStore");
        System.out.println(petStoreService.getText());
    }

    public static void start1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring/Core/services.xml");
        PetStoreServiceImpl petStoreService = context.getBean("pet",PetStoreServiceImpl.class);
        System.out.println(petStoreService.getText());
    }
}