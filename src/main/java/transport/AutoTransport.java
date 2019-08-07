package transport;

public abstract class AutoTransport extends Vehicle {

    public boolean checkIfRouteIsValid(String placeA, String placeB) {
        return !placeA.equals(Destination.ISLAND.toString()) && !placeB.equals(Destination.ISLAND.toString());
    }
}
