package transport.railway;

import transport.VehicleType;

public class PassengerTrain extends RailwayTransport {

    private static final String RW_PASSENGER_TRAIN = "Passenger Train";
    private static final int RIDERSHIP = 900;
    private static final int TONNAGE = 1100;
    private static final int SPEED = 130;

    public PassengerTrain() {
        super (VehicleType.PASSENGER, RW_PASSENGER_TRAIN, RIDERSHIP, TONNAGE, SPEED);
    }
}
