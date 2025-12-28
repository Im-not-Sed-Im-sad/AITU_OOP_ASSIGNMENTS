package humans;

public abstract class Human {

    protected String name;
    protected int age;
    protected boolean isAlive;

    public Human(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    public void introduce() {
        System.out.println("Hi my name is " + name);
    }

    public abstract void showRole();

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public boolean isAlive() { return isAlive; }
    public void setAlive(boolean alive) { isAlive = alive; }
}
