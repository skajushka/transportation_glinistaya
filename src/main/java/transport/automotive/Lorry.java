package transport.automotive;

import transport.LoadType;

public class Lorry  extends AutoTransport {

    private static final String AT_LORRY = "Lorry";
    private static final int RIDERSHIP = 0;
    private static final int TONNAGE = 500;
    private static final int SPEED = 90;

    public Lorry() {
        super (LoadType.CARGO, AT_LORRY, RIDERSHIP, TONNAGE, SPEED);
    }
}
