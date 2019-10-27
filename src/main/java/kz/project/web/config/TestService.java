package kz.project.web.config;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;

public class TestService {

    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public List<String> getAllTests(){

        List<String> allTests=null;
        try{

            Session session = getSessionFactory().openSession();
            Criteria criteria = session.createCriteria(String.class);
            allTests = (List<String>) criteria.list();

        }catch(Exception e){

        }

        return allTests;
    }

}