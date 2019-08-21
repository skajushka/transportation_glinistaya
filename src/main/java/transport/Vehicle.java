package transport;

public abstract class Vehicle {

    private LoadType loadType;
    private String vehicleName;
    private int maxTonnage;
    private int maxRidership;
    private double maxSpeed;

    public Vehicle (LoadType loadType, String vehicleName, int maxRidership, int maxTonnage, int maxSpeed) {
        this.loadType = loadType;
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

    public LoadType getLoadType() {
        return loadType;
    }
}
