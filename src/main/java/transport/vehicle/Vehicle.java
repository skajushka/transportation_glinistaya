package transport.vehicle;

import java.util.Set;

public abstract class Vehicle {

    private String vehicleName;
    private int maxTonnage;
    private int maxRidership;
    private double maxSpeed;
    private Set<DestinationType> destinations;

    public Vehicle (String vehicleName, int maxRidership, int maxTonnage, int maxSpeed,  Set<DestinationType> destinations) {
        this.vehicleName = vehicleName;
        this.maxRidership = maxRidership;
        this.maxTonnage = maxTonnage;
        this.maxSpeed = maxSpeed;
        this.destinations = destinations;
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
