package transport.railway;

public class CargoTrain extends RailwayTransport {

    private static final String RW_CARGO_TRAIN = "Cargo Train";
    private static final int RIDERSHIP = 0;
    private static final int TONNAGE = 10000;
    private static final int SPEED = 90;

    public CargoTrain() {
        super (RW_CARGO_TRAIN, RIDERSHIP, TONNAGE, SPEED, DESTINATIONS);
    }
}
