import java.util.Scanner;

void main() {
    Scanner sc = new Scanner(System.in);

    Vehicle vehicle1 = new Vehicle();
    vehicle1.setSize("Small");
    vehicle1.setWeight("950 kg");
    vehicle1.setCoordinatex(12);
    vehicle1.setCoordinatey(23);
    vehicle1.toMove(5, 8);

    Car car1 = new Car();
    car1.setSize("Small");
    car1.setWeight("700 kg");
    car1.setCoordinatex(10);
    car1.setCoordinatey(20);
    car1.toMove(11, 2);

    Track track1 = new Track();
    track1.setSize("Average");
    track1.setWeight("1000 kg");
    track1.setCoordinatex(1200);
    track1.setCoordinatey(200);
    track1.toMove(100, 200);

}
