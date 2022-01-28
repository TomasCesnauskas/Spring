package hibernate.demo;

import hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreatStudentDAO {
    public static void main(String[] args) {

//    creat session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

//        creat session
        Session session = factory.getCurrentSession();

try {
//    create a student obj
    System.out.println("Creating new student obj");
    Student student = new Student("Petras", "Petraitis", "petras@gmail.com");

//    start transaction
    session.beginTransaction();

//    save the student
    System.out.println("Saving student obj");
    session.save(student);

//    commit the transaction
    session.getTransaction().commit();
    System.out.println("Done.");

} finally {
    factory.close();
}

    }
}
