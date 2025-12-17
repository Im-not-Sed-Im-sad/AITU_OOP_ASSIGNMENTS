public class Human{
    private String name;
    private int age;
    private boolean IsAlive;
    public Human(){}
    public Human(String name, int age, boolean IsAlive){
        this.name = name;
        this.age = age;
        this.IsAlive = IsAlive;
    }
    public Human(String name, int age){
        this.name = name;
        this.age = age;
    }
    public Human(String name){
        this.name = name;
    }
    public Human(String name, boolean IsAlive){
        this.name = name;
        this.IsAlive = IsAlive;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public boolean getIsAlive() {
        return IsAlive;
    }

    public void setIsAlive(boolean alive) {
        IsAlive = alive;
    }

    public void FirstCommon() {
        System.out.println("Hi " + name);
    }
    public void SecondCommon() {
        System.out.println("You are " + age + " years old");
        if(IsAlive){
            System.out.println("And to my regret, you are alive");
        }
        else{
            System.out.println("And, wow, great, you are not alive");
        }
    }
}