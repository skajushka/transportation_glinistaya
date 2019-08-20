package transport.railway;

import transport.Vehicle;
import transport.VehicleType;

public class RailwayTransport extends Vehicle {

    public RailwayTransport(VehicleType vehicleType, String vehicleName, int maxRidership, int maxTonnage, int maxSpeed) {
        super (vehicleType, vehicleName, maxRidership, maxTonnage, maxSpeed);
    }
}
