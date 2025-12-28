package people;

import humans.Human;
import interfaces.IStudy;
import interfaces.IWorker;

public class Employee extends Human implements IWorker, IStudy {

    private String position;
    private float salary;

    public static String companyName = "TechCorp";

    public Employee(String name, int age, boolean isAlive, String position, float salary) {
        super(name, age, isAlive);
        this.position = position;
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println(name + " is working as a " + position + "in a great company: " + companyName);
    }

    @Override
    public void getPaid() {
        System.out.println(name + " gets salary: " + salary);
    }

    @Override
    public void study() {
        System.out.println(name + " is attending training lessons.");
    }

    @Override
    public void doAssignment() {
        System.out.println(name + " is doing company homework.");
    }

    @Override
    public void showRole() {
        System.out.println("I am an employee.");
    }
}
