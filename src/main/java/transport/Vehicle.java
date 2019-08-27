package transport;

import java.util.Set;

public abstract class Vehicle {

    private String vehicleName;
    private int maxTonnage;
    private int maxRidership;
    private double maxSpeed;
    protected Set<DestinationType> destinations;

    public Vehicle (String vehicleName, int maxRidership, int maxTonnage, int maxSpeed) {
        this.vehicleName = vehicleName;
        this.maxRidership = maxRidership;
        this.maxTonnage = maxTonnage;
        this.maxSpeed = maxSpeed;;
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

    public Set<DestinationType> getDestinations() {
        return destinations;
    }
}
