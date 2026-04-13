package app;

import config.HibernateUtil;

public class TestHibernate {
    public static void main(String[] args) {
        HibernateUtil.getSessionFactory();
        System.out.println("Hibernate started successfully!");
    }
}