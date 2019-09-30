package transport.vehicle.automotive;

import com.google.common.collect.ImmutableSet;
import transport.Load;
import transport.vehicle.DestinationType;
import transport.vehicle.Vehicle;

public abstract class AutoTransport extends Vehicle {

    public AutoTransport(String vehicleName, Load defaultLoad, int maxSpeed) {
        super (vehicleName, defaultLoad, maxSpeed, ImmutableSet.of(DestinationType.RAILWAYSTATION, DestinationType.OTHER));
    }
}
