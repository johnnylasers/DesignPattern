package daoPattern;

/**
 * This is one of components that the DAO pattern requires -- Data/Model/Value object
 */

public class Student {
    private String name;
    private int seatNo;

    public Student(String name, int seatNo) {
        this.name = name;
        this.seatNo = seatNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }
}
