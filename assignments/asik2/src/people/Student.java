package people;

import humans.Human;
import interfaces.IStudy;

public final class Student extends Human implements IStudy {

    private String university;
    private float gpa;

    // final field (cannot be changed)
    public final String idNumber;

    public Student(String name, int age, boolean isAlive, String university, float gpa, String idNumber) {
        super(name, age, isAlive);
        this.university = university;
        this.gpa = gpa;
        this.idNumber = idNumber;
    }

    // final method (cannot be overridden)
    public final void printID() {
        System.out.println("Student ID: " + idNumber);
    }

    // IStudy implementation
    @Override
    public void study() {
        System.out.println(name + " is studying at " + university);
    }

    @Override
    public void doAssignment() {
        System.out.println(name + " is doing homework.");
    }

    @Override
    public void showRole() {
        System.out.println("I am a student.");
    }
}
