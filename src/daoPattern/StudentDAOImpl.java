package daoPattern;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class StudentDAOImpl implements StudentDAO {

    Set<Student> students;

    /**
     * We also initialize the "database" in the constructor
     */
    public StudentDAOImpl () {
        students = new HashSet<>();

        Student curry = new Student("Steph Curry", 30);
        Student durant = new Student("Kevin Durant", 35);
        Student thompson = new Student("Klay Thompson", 11);

        students.add(curry);
        students.add(durant);
        students.add(thompson);

    }

    @Override
    public Set<Student> getStudentList() {

        return students;
    }

    //Gets the student
    @Override
    public Student getStudent(int seatNo) {
        return
    }

    @Override
    public void updateStudent() {

    }

    @Override
    public void deleteStudent() {

    }

    @Override
    public void addStudent() {

    }

}
