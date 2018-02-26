package springFramework.core;

import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Core {



    public static void main (String [] args){
        start2();

    }

    public static void start1(){
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring/services.xml");
        PetStoreServiceImpl petStoreService = context.getBean("petStore",PetStoreServiceImpl.class);
        System.out.println(petStoreService.text);
    }

    public static void start2(){
        GenericApplicationContext context = new GenericApplicationContext();
        new XmlBeanDefinitionReader(context).loadBeanDefinitions("Spring/services.xml");
        context.refresh();
        PetStoreServiceImpl petStoreService = (PetStoreServiceImpl) context.getBean("petStore");

        System.out.println(petStoreService.text);

    }


    public static PetStoreServiceImpl createStatic(){
        return new PetStoreServiceImpl();
    }

}
