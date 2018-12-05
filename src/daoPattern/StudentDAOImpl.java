package daoPattern;

import java.util.*;

import java.util.HashSet;

/**
 * Implements all the business logic for the API exposed to the end user
 */
public class StudentDAOImpl implements StudentDAO {

    List<Student> students;
    Set<Integer> seatTaken;

    /**
     * We also initialize the "database" in the constructor
     */
    public StudentDAOImpl() {
        students = new ArrayList<>();

        Student curry = new Student("Steph Curry", 30);
        Student durant = new Student("Kevin Durant", 35);
        Student thompson = new Student("Klay Thompson", 11);

        students.add(curry);
        students.add(durant);
        students.add(thompson);

        students.forEach(s -> seatTaken.add(s.getSeatNo()));

    }

    @Override
    public List<Student> getStudentList() {

        return students;
    }

    //Gets a student when given a seat number
    @Override
    public Student getStudent(int seatNo) {
        if (seatNo <= 0) {
            throw new IllegalArgumentException("Seat Number must be positive!");
        } else {
            for (Student s : students) {
                if (s.getSeatNo() == seatNo) {
                    return s;
                }
            }

            return null;
        }
    }

    @Override
    public void updateStudentSeatNum(Student student, int seatNum) {
        if (!students.contains(student)) {
            throw new IllegalArgumentException("Student name: " + student.getName() + "doesn't exist!");
        }

        if (student.getSeatNo() == seatNum) {
            System.out.println("This is already the student's own seat!");
        } else if (seatTaken.contains(seatNum)) {
            System.out.println("This seat has been taken!");
        } else {
            student.setSeatNo(seatNum);
        }

    }

    @Override
    public void deleteStudent(Student student) {

        if (!students.contains(student)) {
            throw new IllegalArgumentException("Student name: " + student.getName() + "doesn't exist!");
        }

        seatTaken.remove(student.getSeatNo());
        students.remove(student);

    }

    @Override
    public void addStudent(Student student) {
        if (student == null) {
            throw new IllegalArgumentException("Student can't be null!");
        }

        if (seatTaken.contains(student.getSeatNo())) {
            throw new IllegalArgumentException("Can't accept this student. Seat has been taken!");
        }

        students.add(student);
        seatTaken.add(student.getSeatNo());
    }

}
