package transport.vehicle.marine;

import com.google.common.collect.ImmutableSet;
import transport.Load;
import transport.vehicle.DestinationType;
import transport.vehicle.Vehicle;

public abstract class SeaTransport extends Vehicle {

    public SeaTransport(String vehicleName, Load defaultLoad, int maxSpeed) {
        super (vehicleName, defaultLoad, maxSpeed, ImmutableSet.of(DestinationType.ISLAND));
    }
}
