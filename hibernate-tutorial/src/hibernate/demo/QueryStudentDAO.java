package hibernate.demo;

import hibernate.demo.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class QueryStudentDAO {
    public static void main(String[] args) {

//    creat session factory
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

//        creat session
        Session session = factory.getCurrentSession();

try {

//    start transaction
    session.beginTransaction();

//    query students
    List<Student> students = session.createQuery("From Student").getResultList();

//    display students

displayStudents(students);

//    session.getTransaction().commit();

//Session session1 = factory.getCurrentSession();
//    session1.beginTransaction();
//    query students: lastName Domaitis

  List<Student> students1 = session.createQuery("FROM Student s WHERE s.lastName = 'Domaitis' ").getResultList();
    displayStudents(students1);


//    query students: lastName Domaitis or firstname Tomas
    List<Student> students2 = session.createQuery("From Student  s where s.lastName = 'Domaitis' OR s.firstName = 'Tomas'").getResultList();
    System.out.println("Studentai vardu Tomas arba pavarde Domaitis");
    displayStudents(students2);

    session.getTransaction().commit();


    System.out.println("Done.");

} finally {
    factory.close();
}

    }
    public static void displayStudents(List<Student> students){
        for(Student student: students){
            System.out.println(student);
    }
}}
