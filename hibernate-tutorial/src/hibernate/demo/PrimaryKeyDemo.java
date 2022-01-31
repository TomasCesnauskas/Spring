package hibernate.demo;

import hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PrimaryKeyDemo {
    public static void main(String[] args) {

//    creat session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

//        creat session
        Session session = factory.getCurrentSession();

try {
//    create a three student obj
    System.out.println("Creating 3 students obj");
    Student student1 = new Student("Petras", "Petraitis", "petras@gmail.com");
    Student student2 = new Student("Jonas", "Jonaitis", "onaitis@gmail.com");
    Student student3 = new Student("Domas", "Domaitis", "domaitis@gmail.com");

//    start transaction
    session.beginTransaction();

//    save the students
    System.out.println("Saving student obj");
    session.save(student1);
    session.save(student2);
    session.save(student3);

//    commit the transaction
    session.getTransaction().commit();
    System.out.println("Done.");

} finally {
    factory.close();
}

    }
}
