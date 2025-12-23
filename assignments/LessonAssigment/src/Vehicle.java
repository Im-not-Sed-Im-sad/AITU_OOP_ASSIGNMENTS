public class Vehicle {
    private String size;
    private String weight;
    private int height;
    protected int coordinatex;
    protected int coordinatey;
    public  Vehicle() {}
    public Vehicle(String size, String weight, String height, int coordinatex, int coordinatey) {}
    public Vehicle(String size, String color, int price) {}

    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }

    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public int getCoordinatex() {return coordinatex;}
    public void setCoordinatex(int coordinatex) {this.coordinatex = coordinatex;}

    public int getCoordinatey() {return coordinatey;}

    public void setCoordinatey(int coordinatey) {this.coordinatey = coordinatey;}

    public void toMove(int dx, int dy) {
        System.out.println("Your coordinates " + coordinatex + " " + coordinatey);
        System.out.println("Moving right to " + dx + " Moving up to " + dy);
        coordinatex += dx;
        coordinatey += dy;
        System.out.println("your new coordinates: " + coordinatex + " " + coordinatey);
    }

}
