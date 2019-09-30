package transport.vehicle.marine;

import transport.Load;

public class Yacht extends SeaTransport {

    private static final String ST_YACHT = "Yacht";
    private static final int RIDERSHIP = 20;
    private static final int TONNAGE = 7000;
    private static final int SPEED = 90;

    public Yacht() {
        super (ST_YACHT, new Load(RIDERSHIP, TONNAGE), SPEED);
    }
}
