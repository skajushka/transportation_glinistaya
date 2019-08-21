package transport.railway;

import transport.Vehicle;
import transport.LoadType;

public class RailwayTransport extends Vehicle {

    public RailwayTransport(LoadType loadType, String vehicleName, int maxRidership, int maxTonnage, int maxSpeed) {
        super (loadType, vehicleName, maxRidership, maxTonnage, maxSpeed);
    }
}
