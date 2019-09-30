package transport.vehicle.marine;

import transport.Load;

public class Barge extends SeaTransport {

    private static final String ST_BARGE = "Barge";
    private static final int RIDERSHIP = 0;
    private static final int TONNAGE = 700000;
    private static final int SPEED = 40;

    public Barge() {
        super (ST_BARGE, new Load(RIDERSHIP, TONNAGE), SPEED);
    }
}
