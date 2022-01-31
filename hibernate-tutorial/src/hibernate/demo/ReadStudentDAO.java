package hibernate.demo;

import hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.SQLOutput;

public class ReadStudentDAO {
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
    Student student = new Student("Tomas", "Juozaitis", "juozaitis@gmail.com");

//    start transaction
    session.beginTransaction();

//    save the student
    System.out.println("Saving student obj");
    System.out.println(student);
    session.save(student);

//    commit the transaction
    session.getTransaction().commit();

//    find out students id: primary key.
    System.out.println("saved student. generated id: " +student.getId());
//    get a new session and start transaction


session = factory.getCurrentSession();
//   session = sessionFactory.getCurrentSession();


session.beginTransaction();
//    retrieve student based on id: primary key
    System.out.println("Getting student with id: " + student.getId());
    Student student1 = session.get(Student.class, student.getId());


    session.getTransaction().commit();
    System.out.println("Get complete: " + student1);

    System.out.println("Done.");

} finally {
    factory.close();
}

    }
}
