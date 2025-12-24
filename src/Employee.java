public class Employee  extends Human {
    private String employeeStudy;
    private float employeeSalary;
    public static String companyName = "AITU" ;

    public Employee() {}
    public Employee(String name, int age,boolean isAlive, String employeeStudy, float employeeSalary){
        super(name, age, isAlive);
        this.employeeStudy = employeeStudy;
        this.employeeSalary = employeeSalary;
    }
    public Employee(String name, int age,boolean isAlive, String employeeStudy){
        super(name, age, isAlive);
        this.employeeStudy = employeeStudy;

    }
    public Employee(String name, int age,boolean isAlive, float employeeSalary){
        super(name, age, isAlive);
        this.employeeSalary = employeeSalary;
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
        return employeeSalary;
    }
    public void setEmployeeSalary(float EmployeeSalary) {this.employeeSalary = EmployeeSalary;}

    public String getEmployeestudy() {
        return employeeStudy;
    }
    public void setEmployeestudy(String EmployeeStudy) {this.employeeStudy = EmployeeStudy;}
}