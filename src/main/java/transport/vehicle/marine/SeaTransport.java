package transport.vehicle.marine;

import com.google.common.collect.ImmutableSet;
import transport.vehicle.DestinationType;
import transport.vehicle.Vehicle;

public abstract class SeaTransport extends Vehicle {

    public SeaTransport(String vehicleName, int maxRidership, int maxTonnage, int maxSpeed) {
        super (vehicleName, maxRidership, maxTonnage, maxSpeed, ImmutableSet.of(DestinationType.ISLAND));
    }
}
