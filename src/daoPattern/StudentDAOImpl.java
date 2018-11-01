package daoPattern;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentDAOImpl implements StudentDAO {

    private List<Student> students;
    private Set<Integer> takenSeats;

    // a very rough initialization/presentation of our database
    public StudentDAOImpl() {
        Student james = new Student("LeBron James", 1);
        Student curry = new Student("Stephen Curry", 2);
        Student thompson = new Student("Klay Thompson", 3);
        Student durant = new Student("Kevin Durant", 4);
        Student irving = new Student("Kyrie Irving", 5);

        takenSeats = new HashSet<>();

        for (int i = 1; i <= 5; i++) {
            takenSeats.add(i);
        }
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudentName(String name) {

    }

    public void updateStudentSeatNum(String name, int seatNum) {

    }

    public void deleteStudent(String name) {

    }
}
