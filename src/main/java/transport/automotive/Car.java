package transport.automotive;

public class Car extends AutoTransport {

    private static final String AT_CAR = "Car";
    private static final int RIDERSHIP = 4;
    private static final int TONNAGE = 200;
    private static final int SPEED = 150;

    public Car() {
        super (AT_CAR, RIDERSHIP, TONNAGE, SPEED);
    }
}
