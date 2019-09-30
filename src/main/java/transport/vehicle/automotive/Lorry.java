package transport.vehicle.automotive;

import transport.Load;

import java.util.TooManyListenersException;

public class Lorry extends AutoTransport {

    private static final String AT_LORRY = "Lorry";
    private static final int RIDERSHIP = 0;
    private static final int TONNAGE = 500;
    private static final int SPEED = 90;

    public Lorry() {
        super (AT_LORRY, new Load(RIDERSHIP, TONNAGE), SPEED);
    }
}
