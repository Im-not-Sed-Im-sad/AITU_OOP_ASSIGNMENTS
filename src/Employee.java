public class Employee  extends Human {
    private String EmployeeStudy;
    private float EmployeeSalary;
    public static String companyName = "AITU";

    public Employee() {}
    public Employee(String name, int age,boolean IsAlive, String EmployeeStudy, float EmployeeSalary){
        super(name, age, IsAlive);
        this.EmployeeStudy = EmployeeStudy;
        this.EmployeeSalary = EmployeeSalary;
    }
    public Employee(String name, int age,boolean IsAlive, String EmployeeStudy){
        super(name, age, IsAlive);
        this.EmployeeStudy = EmployeeStudy;

    }
    public Employee(String name, int age,boolean IsAlive, float EmployeeSalary){
        super(name, age, IsAlive);
        this.EmployeeSalary = EmployeeSalary;
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

    public float getEmployeeSalary() {
        return EmployeeSalary;
    }
    public void setEmployeeSalary(float EmployeeSalary) {this.EmployeeSalary = EmployeeSalary;}

    public String getEmployeeStudy() {
        return EmployeeStudy;
    }
    public void setEmployeeStudy(String EmployeeStudy) {this.EmployeeStudy = EmployeeStudy;}
}