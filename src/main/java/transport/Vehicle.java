package transport;

public abstract class Vehicle {

    public static final String PASSENGER_TYPE = "Passenger";
    public static final String CARGO_TYPE = "Cargo";

    private int maxSpeed;
    private int maxTonnage;
    private int maxRidership;

    public int getMaxTonnage() {
        return maxTonnage;
    }

    public int getMaxRidership() {
        return maxRidership;
    }

    public abstract void transfer(String placeA, String placeB, int distance);

    public boolean checkIfCargoAmountAllowed(int cargoAmount) {
        return getMaxTonnage() >= cargoAmount;
    }


    public boolean checkIfPassengersAmountAllowed(int passengerAmount) {
        return getMaxRidership() >= passengerAmount;
    }
}
