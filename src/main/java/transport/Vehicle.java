package transport;

public abstract class Vehicle {

    private VehicleType vehicleType;
    private String vehicleName;
    private int maxTonnage;
    private int maxRidership;
    private int maxSpeed;

    public Vehicle (VehicleType vehicleType, String vehicleName, int maxRidership, int maxTonnage, int maxSpeed) {
        this.vehicleType = vehicleType;
        this.vehicleName = vehicleName;
        this.maxRidership = maxRidership;
        this.maxTonnage = maxTonnage;
        this.maxSpeed = maxSpeed;
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

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public abstract boolean checkIfRouteIsValid(DestinationType placeA, DestinationType placeB);

    public boolean checkIfCargoAmountAllowed(Vehicle vehicle, int cargoAmount) {
        return vehicle.getMaxTonnage() >= cargoAmount;
    }

    public boolean checkIfPassengersAmountAllowed(Vehicle vehicle, int passengerAmount) {
        if (vehicle.getVehicleType() == VehicleType.PASSENGER) {
            return getMaxRidership() >= passengerAmount;
        }
        return false;
    }

    public int calculateJourneyTime(int distance, int speed) {
        return distance / speed;
    }
}
