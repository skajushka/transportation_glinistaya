package transport;

public abstract class Vehicle {

    private VehicleType vehicleType;
    private String vehicleName;
    private int maxTonnage;
    private int maxRidership;
    private double maxSpeed;

    public Vehicle (VehicleType vehicleType, String vehicleName, int maxRidership, int maxTonnage, int maxSpeed) {
        this.vehicleType = vehicleType;
        this.vehicleName = vehicleName;
        this.maxRidership = maxRidership;
        this.maxTonnage = maxTonnage;
        this.maxSpeed = maxSpeed;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public int getMaxTonnage() {
        return maxTonnage;
    }

    public int getMaxRidership() {
        return maxRidership;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }
}
