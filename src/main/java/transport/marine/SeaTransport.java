package transport.marine;

import transport.DestinationType;
import transport.Vehicle;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SeaTransport extends Vehicle {

    protected static final List<DestinationType> DESTINATIONS = Collections.unmodifiableList(Arrays.asList(DestinationType.ISLAND));

    public SeaTransport(String vehicleName, int maxRidership, int maxTonnage, int maxSpeed,
                        List<DestinationType> destination) {
        super (vehicleName, maxRidership, maxTonnage, maxSpeed, destination);
    }
}
