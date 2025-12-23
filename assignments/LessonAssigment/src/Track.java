public class Track extends Vehicle {
    private String workPurpose;

    public Track() {}
    public Track(String size, String weight, String height, int coordinatex, int coordinatey, String workPurpose) {
        super(size, weight, height, coordinatex, coordinatey);
        this.workPurpose = workPurpose;
    }

    public String getWorkPurpose() {return workPurpose;}
    public void setWorkPurpose(String workPurpose) {this.workPurpose = workPurpose;}

    public void whyImWork(String workPurpose) {
        System.out.println("My work purpose is " + workPurpose);
    }
    @Override
    public void toMove(int x, int y) {
        System.out.println("Your coordinates " + coordinatex + " " + coordinatey);

        coordinatex -= x;
        coordinatey -= y;

        System.out.println("Track moves in opposite direction");
        System.out.println("Moving left to " + x + " Moving down to " + y);
        System.out.println("Your new coordinates " + coordinatex + " " + coordinatey);
    }
}
