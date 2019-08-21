package transport.railway;

import transport.LoadType;

public class CommuterTrain extends RailwayTransport {

    private static final String RW_COMMUTER_TRAIN = "Commuter Train";
    private static final int RIDERSHIP = 1050;
    private static final int TONNAGE = 1000;
    private static final int SPEED = 100;

    public CommuterTrain() {
        super (LoadType.PASSENGER, RW_COMMUTER_TRAIN, RIDERSHIP, TONNAGE, SPEED);
    }
}
