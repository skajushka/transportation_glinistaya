package transport.vehicle.marine;

import transport.Load;

public class Tanker extends SeaTransport {

    private static final String ST_TANKER = "Tanker";
    private static final int RIDERSHIP = 0;
    private static final int TONNAGE = 10000000;
    private static final int SPEED = 70;

    public Tanker() {
        super (ST_TANKER, new Load(RIDERSHIP, TONNAGE), SPEED);
    }
}
