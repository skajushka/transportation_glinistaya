package transport.vehicle.railway;

import com.google.common.collect.ImmutableSet;
import transport.vehicle.DestinationType;
import transport.vehicle.Vehicle;

public abstract class RailwayTransport extends Vehicle {

    public RailwayTransport(String vehicleName, int maxRidership, int maxTonnage, int maxSpeed) {
        super (vehicleName, maxRidership, maxTonnage, maxSpeed, ImmutableSet.of(DestinationType.RAILWAYSTATION, DestinationType.OTHER));
    }
}
