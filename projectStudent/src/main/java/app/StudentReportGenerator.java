package app;

import config.HibernateUtil;
import model.Student;
import org.hibernate.Session;

import java.util.List;

public class StudentReportGenerator {

    public static void main(String[] args) {

        Session session = HibernateUtil.getSessionFactory().openSession();

        List<Student> students =
                session.createQuery("from Student", Student.class).list();

        for (Student s : students) {
            System.out.println(
                    s.getStudentId() + " | " +
                            s.getFullName() + " | " +
                            s.getEmail() + " | " +
                            s.getAge()
            );
        }

        session.close();
    }
}