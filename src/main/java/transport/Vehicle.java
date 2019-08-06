package transport;

public class Vehicle {
    private int speed;

    public void transport(int speed) {
        this.speed = speed;
    }

    public void transfer(String placeA, String placeB) {
    }

    public boolean checkIfCargoAmountAllowed(int cargoAmount) {
        return true;
    }

    public boolean checkIfPassengersAmountAllowed(int passengersAmount) {
        return true;
    }
}
