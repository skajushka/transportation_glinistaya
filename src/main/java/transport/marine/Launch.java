package transport.marine;

import transport.LoadType;

public class Launch extends SeaTransport {

    private static final String ST_LAUNCH = "Launch";
    private static final int RIDERSHIP = 10;
    private static final int TONNAGE = 80;
    private static final int SPEED = 50;

    public Launch() {
        super (LoadType.PASSENGER, ST_LAUNCH, RIDERSHIP, TONNAGE, SPEED);
    }
}
