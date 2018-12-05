package daoPattern;

import java.util.List;


/**
 * This is the top-level interface which 1) exposes core functionalities to the client/driver program
 * 2) accesss the data object with its implementing business logic


/**
 * One of required component of DAO pattern
 *
 * The interface will declare the operations to be performed on the data/model objects.
 * Hence, there's a direct interaction between data and the interface
 */

public interface StudentDAO {


    List<Student> getStudentList();

    Student getStudent(int seatNo);

    void updateStudentSeatNum(Student name, int seatNum);

    void deleteStudent(Student student);

    void addStudent(Student student);

}
