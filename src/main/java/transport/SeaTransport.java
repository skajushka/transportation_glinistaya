package transport;

public abstract class SeaTransport extends Vehicle {

    public boolean checkIfRouteIsValid(String placeA, String placeB) {
        return placeA.equals(Destination.ISLAND.toString()) && placeB.equals(Destination.ISLAND.toString());
    }
}
