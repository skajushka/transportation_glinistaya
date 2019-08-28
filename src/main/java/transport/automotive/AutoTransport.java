package transport.automotive;

import com.google.common.collect.ImmutableSet;
import transport.DestinationType;
import transport.Vehicle;

public abstract class AutoTransport extends Vehicle {

    public AutoTransport(String vehicleName, int maxRidership, int maxTonnage, int maxSpeed) {
        super (vehicleName, maxRidership, maxTonnage, maxSpeed, ImmutableSet.of(DestinationType.RAILWAYSTATION, DestinationType.OTHER));
    }
}
