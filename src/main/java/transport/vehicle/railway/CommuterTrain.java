package transport.vehicle.railway;

import transport.Load;

public class CommuterTrain extends RailwayTransport {

    private static final String RW_COMMUTER_TRAIN = "Commuter Train";
    private static final int RIDERSHIP = 1050;
    private static final int TONNAGE = 1000;
    private static final int SPEED = 100;

    public CommuterTrain() {
        super (RW_COMMUTER_TRAIN, new Load(RIDERSHIP, TONNAGE), SPEED);
    }
}
