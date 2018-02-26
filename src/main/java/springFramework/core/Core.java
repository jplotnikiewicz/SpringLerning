package springFramework.core;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;


public class Core {



    public static void main (String [] args){
        start4();

    }

    public static void start4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring/services.xml");
        SampleClass sample = context.getBean("noStaticSample",SampleClass.class);
        System.out.println(sample.text);
    }

    public static void start3(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring/services.xml");
        SampleClass sample = context.getBean("sample",SampleClass.class);
        System.out.println(sample.text);
    }

    public static void start2(){
        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("Spring/services.xml");
        context.refresh();
        PetStoreServiceImpl petStoreService = (PetStoreServiceImpl) context.getBean("petStore");
        System.out.println(petStoreService.text);
    }

    public static void start1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring/services.xml");
        PetStoreServiceImpl petStoreService = context.getBean("pet",PetStoreServiceImpl.class);
        System.out.println(petStoreService.text);
    }
}