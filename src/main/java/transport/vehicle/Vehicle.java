package transport.vehicle;

import transport.Load;

import java.util.Set;

public abstract class Vehicle {

    private String vehicleName;
    private Load defaultLoad;
    private double maxSpeed;
    private Set<DestinationType> destinations;

    public Vehicle (String vehicleName, Load defaultLoad, int maxSpeed,  Set<DestinationType> destinations) {
        this.vehicleName = vehicleName;
        this.defaultLoad = defaultLoad;
        this.maxSpeed = maxSpeed;
        this.destinations = destinations;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public Load getDefaultLoad() {
        return defaultLoad;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public Set<DestinationType> getDestinations() {
        return destinations;
    }
}
