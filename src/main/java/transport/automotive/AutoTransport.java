package transport.automotive;

import transport.Vehicle;
import transport.LoadType;

public class AutoTransport extends Vehicle {

    public AutoTransport(LoadType loadType, String vehicleName, int maxRidership, int maxTonnage, int maxSpeed) {
        super (loadType, vehicleName, maxRidership, maxTonnage, maxSpeed);
    }
}
