import humans.Human;
import interfaces.IStudy;
import interfaces.IWorker;
import people.Employee;
import people.Student;

public class Main {
    public static void main(String[] args) {

        Human h1 = new Student("Alex", 19, true, "AITU", 3.1f, "STU123");
        Human h2 = new Employee("Arstan", 40, true, "Developer", 150000.5f);

        Student s1 = new Student("Dias", 18, true, "KBTU", 3.9f, "STD455");
        Employee e1 = new Employee("Meruert", 28, true, "Teacher", 1200f);

        IStudy studyRef = new Student("Evlampij", 21, true, "SDU", 3.2f, "ST002");
        IWorker workerRef = new Employee("Ekaterina", 80, true, "Manager", 2000f);


        h1.introduce();
        h1.showRole();

        s1.printID();
        s1.study();
        s1.doAssignment();
        s1.introduce();

        e1.showRole();
        e1.work();
        e1.getPaid();
        e1.study();
        e1.doAssignment();

        workerRef.work();
        studyRef.study();
    }
}
