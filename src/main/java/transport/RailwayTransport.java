package transport;

public abstract class RailwayTransport extends Vehicle {

    public boolean checkIfRouteIsValid(String placeA, String placeB) {
        return placeA.equals(Destination.RAILWAYSTATION.toString()) && placeB.equals(Destination.RAILWAYSTATION.toString());
    }
}
