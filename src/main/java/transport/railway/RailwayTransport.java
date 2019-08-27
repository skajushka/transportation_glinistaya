package transport.railway;

import transport.DestinationType;
import transport.Vehicle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class RailwayTransport extends Vehicle {

    protected static final List<DestinationType> DESTINATIONS = Collections.unmodifiableList(Arrays.asList(DestinationType.RAILWAYSTATION));

    public RailwayTransport(String vehicleName, int maxRidership, int maxTonnage, int maxSpeed,
                            List<DestinationType> destination) {
        super (vehicleName, maxRidership, maxTonnage, maxSpeed, destination);
    }
}
