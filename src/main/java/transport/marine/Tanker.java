package transport.marine;

import transport.LoadType;

public class Tanker extends SeaTransport {

    private static final String ST_TANKER = "Tanker";
    private static final int RIDERSHIP = 0;
    private static final int TONNAGE = 10000000;
    private static final int SPEED = 70;

    public Tanker() {
        super (LoadType.CARGO, ST_TANKER, RIDERSHIP, TONNAGE, SPEED);
    }
}
