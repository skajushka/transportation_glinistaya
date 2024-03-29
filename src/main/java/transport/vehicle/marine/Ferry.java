package transport.vehicle.marine;

import transport.Load;

public class Ferry extends SeaTransport {

    private static final String ST_FERRY = "Ferry";
    private static final int RIDERSHIP = 18000;
    private static final int TONNAGE = 70000;
    private static final int SPEED = 40;

    public Ferry() {
        super (ST_FERRY, new Load(RIDERSHIP, TONNAGE), SPEED);
    }
}
