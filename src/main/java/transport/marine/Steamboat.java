package transport.marine;

import transport.VehicleType;

public class Steamboat extends SeaTransport {

    private static final String ST_STEAMBOAT = "Steamboat";
    private static final int RIDERSHIP = 5000;
    private static final int TONNAGE = 7000;
    private static final int SPEED = 70;

    public Steamboat() {
        super (VehicleType.PASSENGER, ST_STEAMBOAT, RIDERSHIP, TONNAGE, SPEED);
    }
}