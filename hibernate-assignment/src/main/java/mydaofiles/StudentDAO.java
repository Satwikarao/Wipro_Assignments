package mydaofiles;

import mypojos.Student_123;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class StudentDAO {

    SessionFactory factory = new Configuration()
            .configure("wiprohibernate.cfg.xml")
            .addAnnotatedClass(Student_123.class)
            .buildSessionFactory();

    public void saveStudent(String name, int marks) {
        Session session = factory.getCurrentSession();
        try {
            Student_123 student = new Student_123();
            student.setName(name);
            student.setMarks(marks);

            session.beginTransaction();
            session.save(student);
            session.getTransaction().commit();

            System.out.println("Student Saved Successfully!");
        } finally {
            session.close();
        }
    }
}
