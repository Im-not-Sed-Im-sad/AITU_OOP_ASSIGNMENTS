public class Student  extends Human {
    private String university;
    private float gpa;

    public Student() {}
    public Student(String name, int age, boolean isAlive , String university, float gpa) {
        super(name, age, isAlive);
        this.university = university;
        this.gpa = gpa;
    }
    public Student(String name, int age, boolean isAlive , String university) {
        super(name, age, isAlive);
        this.university = university;
    }
    public Student(String name, int age, boolean isAlive ,float gpa) {
        super(name, age, isAlive);
        this.gpa = gpa;
    }

    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public void setName(String name) {
        super.setName(name);
    }

    @Override
    public boolean getIsAlive() {
        return super.getIsAlive();
    }
    @Override
    public void setIsAlive(boolean IsAlive) {
        super.setIsAlive(IsAlive);
    }

    @Override
    public int getAge() {
        return super.getAge();
    }
    @Override
    public void setAge(int age) {}

    public String getUniversity() {
        return university;
    }
    public void setUniversity(String university) { this.university = university; }
    public float getGpa() { return gpa; }
    public void setGpa(float gpa) { this.gpa = gpa; }
}