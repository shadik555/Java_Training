package HomeWork_23;

public class Driver extends Worker implements Drivable {
    public Driver(String name) {
        super(name);
    }

    @Override
    public void capableOfDriving() {
        System.out.println("Drive car");
    }
}
