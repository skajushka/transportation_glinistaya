package transport.marine;

import transport.Vehicle;
import transport.LoadType;

public class SeaTransport extends Vehicle {

    public SeaTransport(LoadType loadType, String vehicleName, int maxRidership, int maxTonnage, int maxSpeed) {
        super (loadType, vehicleName, maxRidership, maxTonnage, maxSpeed);
    }
}
