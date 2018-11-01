package daoPattern;

import java.util.List;

/**
 * One of required component of DAO pattern
 *
 * The interface will declare the operations to be performed on the data/model objects.
 * Hence, there's a direct interaction between data and the interface
 */

public interface StudentDAO {

    List<Student> getStudents();

    void addStudentName(String name);

    void updateStudentSeatNum(String name, int seatNum);

    void deleteStudent(String name);
}
