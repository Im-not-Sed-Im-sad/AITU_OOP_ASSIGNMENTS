public class Car extends Vehicle {
    private String model;

    public Car() {}
    public  Car(String size, String weight, String height, int coordinatex, int coordinatey) {
        super(size, weight, height, coordinatex, coordinatey);
        this.model = model;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {this.model = model;}

    public void myModel(String model) {
        System.out.println("My model is " + model);
    }
    @Override
    public void toMove(int x, int y) {
        int equalMove = x;
        System.out.println("Your coordinates " + coordinatex + " " + coordinatey);
        coordinatex += equalMove;
        coordinatey += equalMove;
        System.out.println("I am moving you to equal coordinates" + "(" + equalMove + ")");
        System.out.println("Your new coordinates " + coordinatex + " " + coordinatey);
    }
}
