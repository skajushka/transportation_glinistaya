package transport.marine;

import transport.Vehicle;
import transport.VehicleType;

public class SeaTransport extends Vehicle {

    public SeaTransport(VehicleType vehicleType, String vehicleName, int maxRidership, int maxTonnage, int maxSpeed) {
        super (vehicleType, vehicleName, maxRidership, maxTonnage, maxSpeed);
    }
}
