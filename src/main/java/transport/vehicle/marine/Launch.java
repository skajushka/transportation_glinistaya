package transport.vehicle.marine;

import transport.Load;

public class Launch extends SeaTransport {

    private static final String ST_LAUNCH = "Launch";
    private static final int RIDERSHIP = 10;
    private static final int TONNAGE = 80;
    private static final int SPEED = 50;

    public Launch() {
        super (ST_LAUNCH, new Load(RIDERSHIP, TONNAGE), SPEED);
    }
}
