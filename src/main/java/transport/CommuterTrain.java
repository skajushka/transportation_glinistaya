package transport;

public class CommuterTrain extends RailwayTransport implements Passenger {
    private int maxTonnage;
    private int maxRidership;
    private int maxSpeed;

    public CommuterTrain(int maxRidership, int maxTonnage, int maxSpeed) {
        this.maxRidership = maxRidership;
        this.maxTonnage = maxTonnage;
        this.maxSpeed = maxSpeed;
    }

    public void setMaxTonnage(int maxTonnage) {
        this.maxTonnage = maxTonnage;
    }

    public int getMaxTonnage() {
        return maxTonnage;
    }

    public int getMaxRidership() {
        return maxRidership;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }


    public void transfer(String placeA, String placeB, int distance) {
        checkIfRouteIsValid(placeA, placeB);
        // to do
    }

    @Override
    public void transportPassengersOrCargo(String loadType, int loadAmount) {
        if (loadType.equals(PASSENGER_TYPE)) {
            checkIfPassengersAmountAllowed(loadAmount);
        } else if (loadType.equals(CARGO_TYPE)) {
            checkIfCargoAmountAllowed(loadAmount);
        }
        throw new IllegalArgumentException("No such type!");
    }

}
