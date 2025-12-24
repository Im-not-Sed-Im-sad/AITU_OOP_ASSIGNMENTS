//Alexandr Dudkin MT-2501//Alexandr Dudkin MT-2501//Alexandr Dudkin MT-2501//Alexandr Dudkin MT-2501//Alexandr Dudkin MT-2501

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Human human1 = new Human("Alex",30 , true);
        Student student1 = new Student("Eddik", 18, true, "AITU", 2.33F);
        Employee employee1 = new Employee("Jack", 23, true, "AITU, bachelor", 911F);

        System.out.println(human1.getName() + " " + human1.getAge() + " " + human1.getIsAlive());
        System.out.println(student1.getName() + " " + student1.getAge() + " " + student1.getIsAlive() + " " + student1.getUniversity() + " " + student1.getGpa());
        System.out.println(employee1.getName() + " " + employee1.getAge() + " " + employee1.getIsAlive() + " " + employee1.getEmployeestudy() + " " + employee1.getEmployeeSalary());

        Human human2 = new Human();
        human2.setName("Alexandr");
        human2.setAge(99);
        human2.setIsAlive(false);

        Student student2 = new Student();
        student2.setName("Alishure");
        student2.setAge(19);
        student2.setIsAlive(true);
        student2.setUniversity("ENU");
        student2.setGpa(3.14F);

        Employee employee2 = new Employee();
        employee2.setName("Diyar");
        employee2.setAge(22);
        employee2.setIsAlive(true);
        employee2.setEmployeeSalary(800.22F);
        employee2.setEmployeestudy("ProMaster");

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Is alive? (true/false): ");
        boolean IsAlive = scanner.nextBoolean();

        scanner.nextLine();

        System.out.print("Enter university: ");
        String university = scanner.nextLine();

        System.out.print("Enter GPA(Float): ");
        float GPA = Float.parseFloat(scanner.nextLine());

        Student student3 = new Student(name, age, IsAlive ,university,GPA);
        System.out.println("There is your student: "+ student3.getName() + " " + student3.getAge() + " " + student3.getIsAlive() + " " + student3.getUniversity() + " " + student3.getGpa());
        System.out.println(" ");
        System.out.println("Hello old man " + human2.getName());
        System.out.println(" ");
        System.out.println(student2.getGpa() + " Wow cool GPA, " + student2.getName());
        System.out.println(" ");
        System.out.println("There is a static field " + Employee.companyName);
        System.out.println(" ");
        human1.FirstCommon();
        System.out.println(" ");
        human1.SecondCommon();
        System.out.println(" ");
        human2.SecondCommon();


    }}