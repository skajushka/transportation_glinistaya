package transport.automotive;

import transport.DestinationType;
import transport.Vehicle;
import transport.VehicleType;

public class AutoTransport extends Vehicle {

    public AutoTransport(VehicleType vehicleType, String vehicleName, int maxRidership, int maxTonnage, int maxSpeed) {
        super (vehicleType, vehicleName, maxRidership, maxTonnage, maxSpeed);
    }

    @Override
    public boolean checkIfRouteIsValid(DestinationType destination) {
        return destination != DestinationType.ISLAND;
    }
}
