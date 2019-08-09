package transport;

public class RailwayTransport extends Vehicle {

    public RailwayTransport(VehicleType vehicleType, String vehicleName, int maxRidership, int maxTonnage, int maxSpeed) {
        super (vehicleType, vehicleName, maxRidership, maxTonnage, maxSpeed);
    }

    public boolean checkIfRouteIsValid(DestinationType placeA, DestinationType placeB) {
        return (placeA == DestinationType.RAILWAYSTATION) && (placeB == DestinationType.RAILWAYSTATION);
    }
}
