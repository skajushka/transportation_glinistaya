package transport.marine;

import transport.VehicleType;

public class Barge extends SeaTransport{

    private static final String ST_BARGE = "Barge";
    private static final int RIDERSHIP = 0;
    private static final int TONNAGE = 700000;
    private static final int SPEED = 40;

    public Barge() {
        super (VehicleType.CARGO, ST_BARGE, RIDERSHIP, TONNAGE, SPEED);
    }
}
