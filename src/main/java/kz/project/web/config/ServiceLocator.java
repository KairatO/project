package kz.project.web.config;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceLocator {

    private ApplicationContext context;
    protected TestService testBean;

    public ServiceLocator(){
        context = new ClassPathXmlApplicationContext("applicationContext.xml");
        testBean = (TestService) context.getBean("testBean");
    }

    public TestService getTestBean(){
        return this.testBean;
    }
}