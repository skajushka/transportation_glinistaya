package transport.vehicle.railway;

import transport.Load;

public class PassengerTrain extends RailwayTransport {

    private static final String RW_PASSENGER_TRAIN = "Passenger Train";
    private static final int RIDERSHIP = 900;
    private static final int TONNAGE = 1100;
    private static final int SPEED = 130;

    public PassengerTrain() {
        super (RW_PASSENGER_TRAIN, new Load(RIDERSHIP, TONNAGE), SPEED);
    }
}
