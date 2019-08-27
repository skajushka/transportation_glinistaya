package transport.railway;

import com.google.common.collect.ImmutableSet;
import transport.DestinationType;
import transport.Vehicle;

public abstract class RailwayTransport extends Vehicle {

    public RailwayTransport(String vehicleName, int maxRidership, int maxTonnage, int maxSpeed) {
        super (vehicleName, maxRidership, maxTonnage, maxSpeed);
        this.destinations = ImmutableSet.of(DestinationType.RAILWAYSTATION);
    }
}
