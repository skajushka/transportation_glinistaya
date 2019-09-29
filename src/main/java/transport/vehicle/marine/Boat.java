package transport.vehicle.marine;

public class Boat extends SeaTransport {

    private static final String ST_BOAT = "Boat";
    private static final int RIDERSHIP = 4;
    private static final int TONNAGE = 30;
    private static final int SPEED = 20;

    public Boat() {
        super (ST_BOAT, RIDERSHIP, TONNAGE, SPEED);
    }
}
