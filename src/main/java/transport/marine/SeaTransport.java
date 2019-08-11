package transport.marine;

import transport.DestinationType;
import transport.Vehicle;
import transport.VehicleType;

public class SeaTransport extends Vehicle {

    public SeaTransport(VehicleType vehicleType, String vehicleName, int maxRidership, int maxTonnage, int maxSpeed) {
        super (vehicleType, vehicleName, maxRidership, maxTonnage, maxSpeed);
    }

    @Override
    public boolean checkIfRouteIsValid(DestinationType placeA, DestinationType placeB) {
        return (placeA == DestinationType.ISLAND) && (placeB == DestinationType.ISLAND);
    }
}
