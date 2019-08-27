package transport;

import java.util.List;

public abstract class Vehicle {

    private String vehicleName;
    private int maxTonnage;
    private int maxRidership;
    private double maxSpeed;
    List<DestinationType> destination;

    public Vehicle (String vehicleName, int maxRidership, int maxTonnage, int maxSpeed,
                    List<DestinationType> destination ) {
        this.vehicleName = vehicleName;
        this.maxRidership = maxRidership;
        this.maxTonnage = maxTonnage;
        this.maxSpeed = maxSpeed;
        this.destination = destination;
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

    public List<DestinationType> getDestination() {
        return destination;
    }
}
