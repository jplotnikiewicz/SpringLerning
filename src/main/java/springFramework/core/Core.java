package springFramework.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

public class Core {



    public static PetStoreServiceImpl createStatic(){
        return new PetStoreServiceImpl();
    }

}
