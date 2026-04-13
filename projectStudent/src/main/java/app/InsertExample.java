package app;

import config.HibernateUtil;
import model.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class InsertExample {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Student student = new Student("Bora", "bora@mail.com", 30);

        session.persist(student);

        tx.commit();
        session.close();

        System.out.println("Student saved!");
    }
}