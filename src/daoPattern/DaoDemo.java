package daoPattern;

/**
 * The problem it tries to solve:
 * The Data Access Object Pattern aims to decouple the low-level data accessing and persisting APIs/operations
 * from the higher-level business logic
 *
 *
 * Question: How does it achieve the decoupling?
 */

public class DaoDemo {

    public static void main(String[] args) {

        StudentDAO api = new StudentDAOImpl();

        api.getStudentList().forEach(student ->
                System.out.println("Student: " + student.getName() + "@Seat No. " + student.getSeatNo()));


    }
}
