package transport.marine;

import com.google.common.collect.ImmutableSet;
import transport.DestinationType;
import transport.Vehicle;

public abstract class SeaTransport extends Vehicle {

    public SeaTransport(String vehicleName, int maxRidership, int maxTonnage, int maxSpeed) {
        super (vehicleName, maxRidership, maxTonnage, maxSpeed, ImmutableSet.of(DestinationType.RAILWAYSTATION, DestinationType.OTHER));
    }
}
