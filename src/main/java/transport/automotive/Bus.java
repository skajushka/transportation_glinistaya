package transport.automotive;

public class Bus extends AutoTransport {

    private static final String AT_BUS = "Bus";
    private static final int RIDERSHIP = 50;
    private static final int TONNAGE = 300;
    private static final int SPEED = 90;

    public Bus() {
        super (AT_BUS, RIDERSHIP, TONNAGE, SPEED);
    }
}
