package daoPattern;

import java.util.List;
import java.util.Set;


/**
 * This is the top-level interface which 1) exposes core functionalities to the client/driver program
 * 2) accesss the data object with its implementing business logic
 */

public interface StudentDAO {

    Set<Student> getStudentList();

    void updateStudent();

    void deleteStudent();

    void addStudent();
}
